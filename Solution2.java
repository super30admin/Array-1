// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


public class Solution2 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];

        int row = 0, col = 0;
        boolean goingUp = true;

        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[row][col];

            if (goingUp) {
                // Moving up-right
                if (col == cols - 1) {
                    row++;
                    goingUp = false;
                } else if (row == 0) {
                    col++;
                    goingUp = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                // Moving down-left
                if (row == rows - 1) {
                    col++;
                    goingUp = true;
                } else if (col == 0) {
                    row++;
                    goingUp = true;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}