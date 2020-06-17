// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> res;
        if(matrix.size()==0) return res;
        int rows = matrix.size();
        int cols = matrix[0].size();
        int left = 0;
        int top =0;
        int bottom = rows-1;
        int right = cols-1;
        
        while(left<=right && top<=bottom){
            //left to right
            for(int i=left; i<=right; i++){
                res.push_back(matrix[top][i]);
            }
             top++;
            
            for(int i=top; i<=bottom; i++){
                res.push_back(matrix[i][right]);
            }
            right--;
            
            if(left<=right && top<=bottom){
                for(int i=right; i>=left; i--){
                    res.push_back(matrix[bottom][i]);
                }
            }
            
            bottom--;
            
            if(top<=bottom && left<=right){
                for(int i=bottom; i>=top; i--){
                    res.push_back(matrix[i][left]);
                }
            }
            
            left++;
     
        }
                              
        return res;
    }
};
