// Time Complexity :O(m*n) where m*n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int top = 0, left = 0;
        int right = matrix[0].size()-1;
        int bottom = matrix.size()-1;
        vector<int> ans;
        while(left <=right && top <= bottom){    // TBLR
            for(int i = left; i<= right; i++){   // 2111
                ans.push_back(matrix[top][i]);
            }
            top++;
            for(int i = top; i<= bottom; i++){
                ans.push_back(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right; i>= left; i--){
                    ans.push_back(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i>= top; i--){
                    ans.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
};