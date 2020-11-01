//Time - O(m*n)
// Space - O(1)
// Keep direction flag, up =1, down =-1
// If we reach boundries change the direction and increase row/col as per the boundry.
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //edge
        if (matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length; // row
        int n = matrix[0].length; // col

        // result array
        int[] result = new int[m * n];
        int r = 0, c = 0;
        int i = 0;
        int dir = 1; // start with up
        while (i < m * n) {
            result[i] = matrix[r][c];
            if (dir == 1) {
                // reached top right
                if (c == n - 1) {
                    r++;
                    dir = -1;
                } else if (r == 0) {
                    //common mistake if r == 0 is checked before c== n-1
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                    dir = 1;
                } else if (c == 0) {
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
            i++;
        }
        return result;
    }
}