
//time complexity : 
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
        
        int n = matrix.size();
        int m = matrix[0].size();
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        vector<int>result;
        
        while(top <= bottom && left <= right) {
            
            
            for(int i = left;i<=right;i++) {
                result.push_back(matrix[top][i]);
            }
            top++;
            
            for(int i = top;i<=bottom;i++) {
                result.push_back(matrix[i][right]);
            }
            right--;
            
            if (top <= bottom && left <= right) {
              for(int i = right;i>=left;i--) {
                result.push_back(matrix[bottom][i]);
            }
            bottom--;  
            }
            
             if (top <= bottom && left <= right) {
              for(int i = bottom;i>=top;i--) {
                result.push_back(matrix[i][left]);
              }
              left++;
             }
            
        }
        
        return result;
    }
};