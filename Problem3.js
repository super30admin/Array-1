// Time Complexity : O(m x n) n number of col , m number of rows;
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//Here we check the boundary conditions top bottom rows and left right cols,
//Traverse the whole outer end elements,
//After that each traversal we push the boundaries inside to cover the inside elements

var spiralOrder = function (matrix) {
    if (!matrix || matrix.length === null) return [];
    let m = matrix.length, n = matrix[0].length;
    let top = 0, left = 0, right = n - 1, bottom = m - 1;
    let result = [];
    while (top <= bottom && left <= right) {

        for (let i = left; i <= right; i++) {
            result.push(matrix[top][i]);
        }
        top++;

        for (let i = top; i <= bottom; i++) {
            result.push(matrix[i][right]);
        }
        right--;

        if (top <= bottom && left <= right) {

            for (let i = right; i >= left; i--) {
                result.push(matrix[bottom][i]);
            }
            bottom--;
        }

        if (top <= bottom && left <= right) {
            for (let i = bottom; i >= top; i--) {
                result.push(matrix[i][left]);
            }
            left++;
        }

    }
    return result;

};