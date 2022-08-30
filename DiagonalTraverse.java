// Time complexity: O(m*n)
// Space complexity: O(1)

// Approach: we have two directions, up direction (1) and down (-1). We have to keep adding elements and move in the same line unless one of the following occurs:

// while going up if we encounter: last column or first row, we have to change direction
// while going down if we encounter: last row or first column, we have to change direction

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[] result = new int[m*n];
        
        int dir = 1;
        int idx = 0;
        int row = 0;
        int col = 0;
        while (idx < result.length) {
            result[idx] = mat[row][col];
            idx++;
            //up direction
            if (dir == 1) {
                if (col == n-1) {//if last column, we change direction
                    dir = -1;
                    row++;
                }
                else if (row == 0) {//if first row, we change direction
                    dir = -1;
                    col++;
                }
                else {//else we don't change direction and continue in that line
                    row--; col++;
                }
            }
            // down direction
            else {
                if (row == m-1) { //if last row, we change direction
                    dir = 1;
                    col++;
                }
                else if (col == 0) {//if first column, we change direction
                    dir = 1;
                    row++;
                }
                else {//else we don't change direction and continue in that line
                    row++; col--;
                }
            }
        }
        return result;
    }
}