// Time Complexity : O(m * n) where m*n is matrix
// Space Complexity : O(m * n)
// Approach : transversing through matrix and handling border conditions with dir pointer which is true for upwards and false for downwards

/**
 * @param {number[][]} mat
 * @return {number[]}
 */
var findDiagonalOrder = function (mat) {
    // true upwards false downwards
    let dir = true
    let m = mat.length
    let n = mat[0].length
    let resArr = new Array(m * n)
    let i = 0
    let j = 0
    for (let idx = 0; idx < resArr.length; idx++) {
        resArr[idx] = mat[i][j]
        if (dir) {
            if (i == 0 && j != n - 1) {
                j++
                dir = false
            } else if (j == n - 1) {
                i++
                dir = false
            } else {
                i--
                j++
            }
        } else {
            if (j == 0 && i != m - 1) {
                i++
                dir = true
            } else if (i == m - 1) {
                j++
                dir = true
            } else {
                j--
                i++
            }
        }
    }
    return resArr
};