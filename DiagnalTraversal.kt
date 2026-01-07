//In this problem we need to traverse a 2d matrix in a diagonal order and return the elements in an array. We use a flag to determine the direction of traversal, either upwards or downwards. We also handle boundary conditions to ensure we don't go out of bounds while traversing the matrix.
// Time complexity is O(m*n) where m is number of rows and n is number of columns. Space complexity is O(1)

class Solution {
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val m = mat.size
        val n = mat[0].size

        val result = IntArray(m*n)
        var flag = true //up
        var r = 0
        var c = 0
        for(i in 0..result.size-1) {
            result[i] = mat[r][c]

            if(flag) {
                if(c == n - 1) {
                    r++;
                    flag = false;
                }
                else if(r == 0) {
                    c++;
                    flag = false;
                }
                else {
                    r--; c++;
                }
            } else {
                if(r == m - 1) {
                    c++;
                    flag = true;
                }
                else if(c == 0) {
                    r++;
                    flag = true;
                }
                else {
                    r++; c--;
                }
            }
        }
        return result
    }
}