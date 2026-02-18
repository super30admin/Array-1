// O(m * n) time, O(1) space
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[m * n];

        int row = 0;
        int col = 0;
        boolean direction = true; // true -> going up, false -> going down

        for (int i = 0; i < n * m; i++) {
            ans[i] = mat[row][col];

            if (direction) {
                if (row == 0 && col != m-1) {
                    col++;
                    direction = false;
                }
                else if (col == m-1) {
                    row++;
                    direction = false;
                }
                else {
                    row--;
                    col++;
                }
            }
            else {
                if (col == 0 && row != n-1) {
                    row++;
                    direction = true;
                }
                else if (row == n-1) {
                    col++;
                    direction = true;
                }
                else {
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}