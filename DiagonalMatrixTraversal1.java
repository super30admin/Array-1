/**
 * url: https://leetcode.com/problems/diagonal-traverse/
 * 498. Diagonal Traverse
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n)
 */
public class DiagonalMatrixTraversal1 {

    public int[] DiagonalMatrixTraversal(int[][] matrix) {

        int n = matrix[0].length; // column
        int m = matrix.length; // row

        if (m == 0 || n == 0) {
            return new int[0];
        }
        if (m == 1) {
            return matrix[0];
        }
        if (n == 1) {
            int[] result = new int[m];
            for (int k = 0; k < m; k++) {
                result[k] = matrix[k][0];
            }
            return result;
        }

        int[] result = new int[m * n];

        String direction = "down";
        int i = 0;
        int j = 0;
        int count = -1;
        while (i < m && j < n) {
            if ((i == 0 && j == 0) || (i == m - 1 && j == n - 1)) { // first and last
                result[++count] = matrix[i][j];
                j++;
            }
            if (direction.equals("down") && i >= 0 && j < n && i < m && j >= 0) {
                result[++count] = matrix[i][j];
                if (j == 0 || i == m - 1) {
                    if(i < m - 1) { // traverse down if we are not at the last row, else traverse right j
                        i++;
                    } else {
                        j++;
                    }
                    direction = "up";
                    continue;
                }
                i++;
                j--;
            }

            if (direction.equals("up") && i < m && j >= 0 && i >= 0 && j < n) {
                result[++count] = matrix[i][j];
                if (i == 0 || j == n - 1) { // traverse right if we are not at the last column, else traverse down i
                    if (j < n - 1) {
                        j++;
                    } else {
                        i++;
                    }

                    direction = "down";
                    continue;
                }
                i--;
                j++;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] result = new DiagonalMatrixTraversal1().DiagonalMatrixTraversal(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("");

        result = new DiagonalMatrixTraversal1().DiagonalMatrixTraversal(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("");

        result = new DiagonalMatrixTraversal1().DiagonalMatrixTraversal(new int[][]{{1, 2}, {4, 5}, {7, 8}});
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("");
    }
}
