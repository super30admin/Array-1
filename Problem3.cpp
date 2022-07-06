Problem 3 -https://leetcode.com/problems/spiral-matrix/
// Time Complexity : O(m*n) where m is number of rows and n is number of columns 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> ans;
        int m = matrix.size(); //rows
        int n = matrix[0].size();
        int left = 0;
        int top = 0;
        int bottom = m-1;
        int right = n-1;
        while(top<=bottom && left<=right){
            //top row
             
                for(int i=left;i<=right;i++){
                    ans.push_back(matrix[top][i]);
                }
                top++;
            
            
            //right column
            if(top<=bottom && left<=right){
                for(int i=top;i<=bottom;i++){
                    ans.push_back(matrix[i][right]);
                }
                right--;
            }
            //bottom row
            if(top<=bottom && left<=right){
                for(int i = right;i>=left;i--){
                    ans.push_back(matrix[bottom][i]);
                }
                bottom--;
            }
            //left column
            if(top<=bottom && left<=right){
                for(int i = bottom; i>=top;i--){
                    ans.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
};