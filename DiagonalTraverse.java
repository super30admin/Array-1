// Time Complexity : O(m*n)
// Space Complexity : O(1)
public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] result = findDiagonalOrder(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int i = 0, j = 0;
        int idx = 0;
        boolean dir = true; // Up
        while (idx < result.length) {
            result[idx] = matrix[i][j];
            idx++;
            if (dir) {
                // Up Direction
                if (i == 0 && j != n - 1) {
                    j++;
                    dir = false;
                } else if (j == n - 1) {
                    i++;
                    dir = false;

                } else {
                    i--;
                    j++;
                }
            } else {
                // Down Direction
                if (j == 0 && i != m - 1) {
                    i++;
                    dir = true;
                } else if (i == m - 1) {
                    j++;
                    dir = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}
