// Time Complexity : O(m * n)
// Space Complexity : O(m * n)
// Did this code successfully run on Leetcode : Yes


class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        // Check if the matrix is null or empty
        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        // Get the dimensions of the matrix
        int m = mat.length;
        int n = mat[0].length;

        // Create an array to store the result
        int[] result = new int[m * n];

        // Initialize variables for current row, column, and direction
        int row = 0;
        int col = 0;
        int direction = 1; // 1 represents moving up, -1 represents moving down

        // Traverse the matrix in diagonal order
        for (int i = 0; i < m * n; i++) {
            // Store the current element in the result array
            result[i] = mat[row][col];

            // Update the row and column indices based on the current direction
            row -= direction;
            col += direction;


            // Handle boundary cases to change direction and adjust indices
            if (row >= m) {
                row = m - 1;
                col += 2;
                direction = -direction;
            }
            if (col >= n) {
                col = n - 1;
                row += 2;
                direction = -direction;
            }
            if (row < 0) {
                row = 0;
                direction = -direction;
            }
            if (col < 0) {
                col = 0;
                direction = -direction;
            }

        }

        // Return the result array
        return result;
    }
}
