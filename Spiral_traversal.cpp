// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> result;
        if(matrix.empty()){
            return {};
        }
        int left = 0, right = matrix[0].size()-1;
        int top = 0, bottom = matrix.size()-1;
        while(top<=bottom &&left<=right){
            if(top<=bottom && left<=right){
                for(int i=left;i<=right;i++){
                    result.push_back(matrix[top][i]);
                }
                top++;
            }
            if(top<=bottom && left<=right){
                for(int i=top;i<=bottom;i++){
                    result.push_back(matrix[i][right]);
                }
                right--;
            }
            if(top<=bottom && left<=right){
                for(int i=right;i>=left;i--){
                    result.push_back(matrix[bottom][i]);
                }
                bottom--;
            }
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                    result.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
};
