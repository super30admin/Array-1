// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Keep track of the top, bottom, left, right boundaries of the matrix
// Once we consume a row or column, shrink the appropriate boundaries
// Check the base case (bounds check) inside the while loop as well, as we are mutating the bounds inside the loop

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size(); int n = matrix[0].size();
        int top = 0; int bottom = m - 1;
        int left = 0; int right = n - 1;
        vector<int> result;
        while(left <= right && top <= bottom) {
            for(int j=left; j<=right; j++) {
                result.push_back(matrix[top][j]);
            }
            top++;

            if(left <= right && top <= bottom) {
                for(int i=top; i<=bottom; i++) {
                    result.push_back(matrix[i][right]);
                }
            }
            right--;

            if(left <= right && top <= bottom) {
                for(int j=right; j>=left; j--) {
                    result.push_back(matrix[bottom][j]);
                }
            }
            bottom--;

            if(left <= right && top <= bottom) {
                for(int i=bottom; i>=top; i--) {
                    result.push_back(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
};