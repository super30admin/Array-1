/**
 * @param {number[][]} mat
 * @return {number[]}
 Intuition:
 I am traversing the matrix diagonally, by tracking the boundaries and maintaining a flag to chech whether i am travelling upward or downward.

 I am updating the flag based on the boundaries i am touching, when we travel upwards, if i am hitting the 1st row but not last column i am moving col pointer to next and updating the dir to down , if i am hitting right boundary i am updating row to next and updating dir to down , otherwise row--, col++;

 When i traverse downwards, if i am hitting left boundary but not the bottom, i am setting my row to next row and updating the dir to up, or if i am hitting bottom then updating col to next column and changing the dir to up, otherwise row++, col--;
 */
var findDiagonalOrder = function (mat) {
    const res = [];
    const m = mat.length;
    const n = mat[0].length;
    let dir = 1;
    let row = 0, col = 0;
    for (let i = 0; i < m * n; i++) {
        // direction is up
        if (dir) {
            // push the current val 
            res[i] = mat[row][col];
            // if the boundary is top but not right
            if (row === 0 && col !== n - 1) {
                col++;
                // set direction to down
                dir = 0;
            } else if (col === n - 1) {
                // case when we hit the right boundary
                row++;
                dir = 0;
            } else {
                // case when we are traversing up wards
                row--;
                col++;
            }
        } else {
            // push the current val 
            res[i] = mat[row][col];
            // if the boundary is left but not bottom
            if (col === 0 && row !== m - 1) {
                row++;
                // set direction to down
                dir = 1;
            } else if (row === m - 1) {
                // case when we hit the bottom boundary
                col++;
                dir = 1;
            } else {
                // case when we are traversing downwards
                row++;
                col--;
            }
        }
    }
    return res;
};