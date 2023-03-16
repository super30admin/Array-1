public class DiagonalOrderOfMatrix {
    // Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;
        boolean dir = true;// move up
        int idx = 0;
        while (idx < result.length) {
            result[idx] = mat[row][col];
            idx++;
            if (dir) {//move up
                if (row == 0 && col != n - 1) { // edge case
                    dir = false;
                    col++;
                } else if (col == n - 1) {
                    dir = false;
                    row++;
                } else {
                    row--;
                    col++;
                }
            } else { // move down
                if (col == 0 && row != m - 1) { // edge case
                    dir = true;
                    row++;
                } else if (row == m - 1) {
                    dir = true;
                    col++;
                } else {
                    col--;
                    row++;
                }
            }
        }
    return result;
    }
}
