// TC = O(mxn)
//SC = O(mxn)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        if (mat == null || mat.length == 0)
            return new int[] {};

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;
        int row = 0;
        int col = 0;
        int dir = 1;

        while (index < m * n) {
            result[index] = mat[row][col];
            index++;
            if (dir == 1) {
                if (col == n - 1) {
                    dir = -1;
                    row++;
                } else if (row == 0) {
                    dir = -1;
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    dir = 1;
                    col++;
                } else if (col == 0) {
                    dir = 1;
                    row++;
                } else {
                    row++;
                    col--;
                }

            }
        }

        return result;

    }
}