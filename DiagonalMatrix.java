class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;  // Number of rows in the matrix
        int n = mat[0].length;  // Number of columns in the matrix

        int dir = 1;  // Direction: 1 for top to bottom, -1 for bottom to top
        int result[] = new int[m * n];  // Array to store the diagonal order
        int index = 0;  // Index to keep track of the current position in the result array
        int row = 0, col = 0;  // Initial position in the matrix

        // Traverse the matrix in the diagonal order
        while (index < m * n) {
            result[index] = mat[row][col];  // Store the current element in the result array
            index++;

            // Update the row and column based on the current direction
            if (dir == 1) {
                if (col == n - 1) {
                    dir = -1;  // Change direction to bottom to top
                    row++;
                } else if (row == 0) {
                    dir = -1;  // Change direction to bottom to top
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    dir = 1;  // Change direction to top to bottom
                    col++;
                } else if (col == 0) {
                    dir = 1;  // Change direction to top to bottom
                    row++;
                } else {
                    col--;
                    row++;
                }
            }
        }

        return result;  // Return the result array containing elements in diagonal order
    }
}

// Time Complexity: O(m*n) - We traverse all elements in the m x n matrix.
// Space Complexity: O(1) - The space used for the result array is not considered in the space complexity analysis.
