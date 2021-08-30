// Time Complexity : O(m x n) n number of col , m number of rows;
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
//We will start with the first element and check for boundary conditions if the element is in the first or last row
// and first or last col and chnage the direction accordingly. 
// Otherwise we will keep adding the elements diagonally.

var findDiagonalOrder = function (mat) {
    if (!mat || mat.length == 0) return [];
    let m = mat.length, n = mat[0].length;
    let result = new Array(m * n - 1);
    let r = 0, c = 0, i = 0, dir = 1;
    while (i <= m * n - 1) {
        result[i] = mat[r][c];
        i++;
        if (dir === 1) {
            if (c === n - 1) {
                r++;
                dir = -1;
            } else if (r === 0) {
                c++;
                dir = -1;
            } else {
                r--;
                c++;
            }
        } else {
            if (r === m - 1) {
                c++;
                dir = 1;
            } else if (c === 0) {
                r++;
                dir = 1;
            } else {
                r++;
                c--;
            }
        }
    }
    return result;
};