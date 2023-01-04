// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


public class diagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[]{};
        }

        // rows
        int m = mat.length;
        // col
        int n = mat.length;

        int[] result = new int[m * n];

        // Dir variable used to check, if the current direction is diagonally up or down
        boolean dir = true;
        int index = 0;
        int row = 0, col = 0;

        while (index < m * n) {
            result[index] = mat[row][col];
            index++;
            // if dir true is going up
            if (dir) {
                // order conditions matters or (r == 0 && c!=n-1) can used
                if (col == n - 1) {
                    row++;
                    dir = false;
                } else if (row == 0) {
                    col++;
                    dir = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                // order conditions matters or (c == 0 && r!=m-1) can used
                if (row == m - 1) {
                    col++;
                    dir = true;
                } else if (col == 0) {
                    row++;
                    dir = true;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }

}