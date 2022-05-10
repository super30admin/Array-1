//TC = O(m*n)
//SC = O(1) ==> we are allowed to return a result array

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int> dp;
        int left = 0, right = n-1;
        int top = 0, bottom = m-1;
        
        while(left<=right && top<=bottom){
            //top row
             for(int i=left;i<=right;i++){
                if(dp.size()==m*n) return dp;
                dp.push_back(matrix[top][i]);
            }
            top++;
            //right col
             for(int i=top;i<=bottom;i++){
                 if(dp.size()==m*n) return dp;
                dp.push_back(matrix[i][right]);
            }
            right--;
            //bottom row
             for(int i=right;i>=left;i--){
                 if(dp.size()==m*n) return dp;
                dp.push_back(matrix[bottom][i]);
            }
            bottom--;
            //left col
             for(int i=bottom;i>=top;i--){
                 if(dp.size()==m*n) return dp;
                dp.push_back(matrix[i][left]);
            }
            left++;
        }
        return dp;
    }
};
