//Time Complexity: O(m*n)
//Space Complexity: O(1)

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];

        int row = 0;
        int col = 0;

        boolean dir = true;

        for (int index = 0; index < m * n; index++) {
            result[index] = mat[row][col];
            if (dir) {
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
