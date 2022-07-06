/*
* Time Complexity: O(m * n)
* Space Complexity: O(1)
* */
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0 || mat == null) {
            return new int[]{};
        }
        int m = mat.length;
        int n = mat[0].length;
        int row = 0, col = 0;
        int[] result = new int[m * n];
        int direction = 1; // 1 for upward and -1 for downward direction
        int index = 0;

        while (index < m * n) {
            result[index] = mat[row][col];
            index++;

            if (direction == 1) {
                if (col == n - 1) {
                    direction = -1;
                    row++;
                } else if (row == 0) {
                    direction = -1;
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    direction = 1;
                    col++;
                } else if (col == 0) {
                    direction = 1;
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
