// Time Complexity : O(mn); m is rows and n is columns
// Space Complexity : O(1); Result array is not considered as extra space
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// We maintain a direction in which we have to move. 
// Going upward(1) and going downward(-1). 
// We check the cases where the direction changes and what change in row/column it results into

// Your code here along with comments explaining your approach
// https://leetcode.com/problems/diagonal-traverse/

/**
 * @param {number[][]} mat
 * @return {number[]}
 */
var findDiagonalOrder = function (mat) {
    if (mat === null || mat.length === 0) {
        return [];
    }
    let ans = [];
    let dir = 1; // Direction 1 -> Going upward; Direction -1 -> Going downward
    let r = 0;
    let c = 0;
    let rows = mat.length; // Total rows
    let cols = mat[0].length; // Total columns
    while (ans.length < rows * cols) {
        ans.push(mat[r][c]);
        if (dir === 1) {
            // Change direction if at last column and do row++
            if (c === cols - 1) {
                dir = -1;
                r++;
            } else if (r == 0) {
                // Change direction if at top row and do col++
                dir = -1;
                c++;
            } else {
                r--;
                c++;
            }

        } else {
            // Change direction if at last row and do col++
            if (r === rows - 1) {
                dir = 1;
                c++;
            } else if (c === 0) {
                // Change direction if at first col and do row++
                dir = 1;
                r++;
            } else {
                r++;
                c--;
            }
        }
    }
    return ans;
};