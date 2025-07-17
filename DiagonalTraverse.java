class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        boolean bottomToTop = true;

        int result[] = new int[m * n];
        int idx = 0;
        int row = 0;
        int col = 0;

        while (idx < m * n) {
            result[idx++] = mat[row][col];

            if (bottomToTop) {
                if (col == n - 1) {
                    row++;
                    bottomToTop = false;
                } else if(row == 0) {
                    col++;
                    bottomToTop = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if(row == m - 1) {
                    col++;
                    bottomToTop = true;
                } else if (col == 0) {
                    row++;
                    bottomToTop = true;
                } else {
                    row++;
                    col--;
                }
            }

        }

        return result;
    }
}