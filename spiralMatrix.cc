// Time Complexity : O(nm) - number of rows n and m columns.
// Space Complexity : O(1) - Did not use extra space.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if(matrix.size()==0) return vector<int>();
        vector<int> results;
        int top = 0;
        int left = 0;
        int right = matrix[0].size() - 1;
        int bottom = matrix.size() - 1;
        while(top <= bottom && left <= right){
            //Traverse left to right
            for(int i = left; i <= right; ++i){
                results.push_back(matrix[top][i]);
            }
            top++;
            //Traverse from top to bottom on the right
            for(int i = top; i <= bottom; ++i){
                results.push_back(matrix[i][right]);
            }
            right--;
            //Traverse from right to left along the bottom row
            if(bottom >= top){
                for(int i = right; i >= left; --i){
                    results.push_back(matrix[bottom][i]);
                }
                bottom--;
            }
            //Traverse from bottom tp top along left column
            if(left <= right){
                for(int i = bottom; i >= top; --i){
                    results.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return results;
    }
};