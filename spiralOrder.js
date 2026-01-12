/**
 * @param {number[][]} matrix
 * @return {number[]}

 We treat the matrix like a set of shrinking boundaries and keep removing it layer by layer in a spiral order.
 Four pointers — top, bottom, left, and right — represent the current rectangle we have not yet visited. 

 In each iteration, we traverse the top row from left to right, then the right column from top to bottom,    followed by the bottom row from right to left, and finally the left column from bottom to top. 

 After completing one full spiral layer, we move the boundaries inward (top++, bottom--, left++, right--) to a  avoid revisiting elements. The loop continues as long as the boundaries are valid, ensuring every cell is visited exactly once in spiral order.
 */
var spiralOrder = function (mat) {
    const res = [];
    let m = mat.length;
    let n = mat[0].length;
    let left = 0, right = n - 1, top = 0, bottom = m - 1;

    while (left <= right && top <= bottom) {
        // top row iteration
        for (let i = left; i <= right; i++) {
            res.push(mat[top][i]);
        }
        top++;
        // right col iteration
        for (let j = top; j <= bottom; j++) {
            res.push(mat[j][right]);
        }
        right--;
        // making sure the bottom conditions are still in place
        if (top <= bottom && left <= right) {
            // bottom row iteration
            for (let k = right; k >= left; k--) {
                res.push(mat[bottom][k]);
            }
            bottom--;
            // left col iteration
            for (let i = bottom; i >= top; i--) {
                res.push(mat[i][left]);
            }
            left++;
        }
    }
    return res;
};