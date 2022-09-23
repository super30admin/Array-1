// Time Complexity : O(mn); m is rows and n is columns
// Space Complexity : O(1); Result array is not considered as extra space
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// We maintain 2 pointers, top, bottom, left, right. We see repeatition of 4 movements. We keep going in those directions till top<=bottom and left<=right
// Move left to right then top++    As we have covered that row
// Move top to bottom then right--  As we have covered that column
// Move right to left then bottom-- As we have covered that row
// Move bottom to top then left++   As we have covered that column

// Your code here along with comments explaining your approach
// https://leetcode.com/problems/spiral-matrix
/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function (matrix) {
    if (matrix === null || matrix.length === 0) {
        return [];
    }
    let result = [];
    let rows = matrix.length;
    let cols = matrix[0].length;
    let top = 0;
    let bottom = rows - 1;
    let left = 0;
    let right = cols - 1;
    while (top <= bottom && left <= right) {
        // Move from left to right
        for (let i = left; i <= right; i++) {
            result.push(matrix[top][i]);
        }
        top++;
        // if((top<=bottom && left<=right)) Check not required as i moves from top to bottom and right is not affected yet
        // Move from top to bottom
        for (let i = top; i <= bottom; i++) {
            result.push(matrix[i][right]);
        }
        right--;

        // Move from right to left. Keep other check as top if affected by top++
        if (top <= bottom) {
            for (let i = right; i >= left; i--) {
                result.push(matrix[bottom][i]);
            }
            bottom--;
        }

        // Move from bottom to top. Keep other check as right is affected by right--
        if (left <= right) {
            for (let i = bottom; i >= top; i--) {
                result.push(matrix[i][left]);
            }
            left++;
        }
    }
    return result;
};