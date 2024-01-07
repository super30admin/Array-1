// Time Complexity : O(m * n) where m*n is matrix
// Space Complexity : O(m * n)
// Approach : transversing on matrix from left to right than top to bottom than right to left than bottom to top 

/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function (matrix) {
    const resultArr = [];

    if (!matrix || matrix.length === 0 || matrix[0].length === 0) {
        return resultArr;
    }

    let top = 0;
    let right = matrix[0].length - 1;
    let bottom = matrix.length - 1;
    let left = 0;

    while (left <= right && top <= bottom) {
        // Traverse right
        for (let j = left; j <= right; j++) {
            resultArr.push(matrix[top][j]);
        }
        top++;

        // Traverse down
        for (let i = top; i <= bottom; i++) {
            resultArr.push(matrix[i][right]);
        }
        right--;

        // Traverse left
        if (top <= bottom) {
            for (let j = right; j >= left; j--) {
                resultArr.push(matrix[bottom][j]);
            }
            bottom--;
        }

        // Traverse up
        if (left <= right) {
            for (let i = bottom; i >= top; i--) {
                resultArr.push(matrix[i][left]);
            }
            left++;
        }
    }
    return resultArr;
};
