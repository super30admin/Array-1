class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[] {};

        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int index = 0;
        int row = 0, col = 0;
        int dir = 1; // 1 = up-right, -1 = down-left

        while (index < m * n) {
            ans[index++] = mat[row][col];

            if (dir == 1) { // moving up-right
                if (col == n - 1) {
                    row++;
                    dir = -1;
                } else if (row == 0) {
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }
            } else { // moving down-left
                if (row == m - 1) {
                    col++;
                    dir = 1;
                } else if (col == 0) {
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return ans;
    }
}
