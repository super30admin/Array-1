// Time Complexity : O(m*n) - m = #rows and n = #columns
// Space Complexity: O(1) - The 'res' vector is returned. So, it won't be considered as extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach:
/*
    1. Using 4 pointers (left, right, top, bottom) to traverse the matrix
    2. We added if conditions before each for loop because we are updating the
    4 pointer varaibles(left, right, top, bottom) inside while loop and this updation
    can violate the while condition. 
*/

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> res;
        if(!matrix.size()) return res;
        int left = 0;
        int right = matrix[0].size()-1;
        int top = 0;
        int bottom = matrix.size()-1;
        
        while(left <= right && top <= bottom) {
            // moving right side
            for(int i = left; i <= right; i++) {
                res.push_back(matrix[top][i]);
            }
            top++;
            
            // moving downwards
            if(left <= right && top <= bottom) {
                for(int i = top; i <= bottom; i++) {
                    res.push_back(matrix[i][right]);
                }
                right--;
            }
            
            // moving left side
            if(left <= right && top <= bottom) {
                for(int i = right; i >= left; i--) {
                    res.push_back(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // moving upwards
            if(left<= right && top <= bottom) {
                for(int i = bottom; i >= top; i--) {
                    res.push_back(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
};
