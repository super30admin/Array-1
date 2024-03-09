import java.util.*;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;
        int direction = 1;

        for (int i = 0; i < m * n; i++) {
            result[i] = matrix[row][col];
            row -= direction;
            col += direction;

            if (row >= m) {
                row = m - 1;
                col += 2;
                direction = -direction;
            }
            if (row < 0) {
                row = 0;
                direction = -direction;
            }
            if (col >= n) {
                col = n - 1;
                row += 2;
                direction = -direction;
            }
            if (col < 0) {
                col = 0;
                direction = -direction;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[] result = findDiagonalOrder(matrix);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 4, 7, 5, 3, 6, 8, 9]
    }
}
