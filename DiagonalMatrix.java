// Time Complexity :O(M*N)
// Space Complexity : O(1) without considering result space.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class DiagonalMatrix {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Input matrix is null");
        }
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];
        int r = 0;
        int c = 0;
        boolean up = true;

        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[r][c];
            if(up) { // Move Up
                if (c == cols - 1) {
                    // Reached last column. Now move to below cell in the same column.
                    // This condition needs to be checked first due to top right corner cell.
                    r++;
                    up=false;
                } else if (r == 0) {
                    // Reached first row. Now move to next cell in the same row.
                    c++;
                    up=false;
                } else {
                    // Somewhere in middle. Keep going up diagonally.
                    r--;
                    c++;
                }
            } else { // Move Down
                if (r == rows - 1) {
                    // Reached last row. Now move to next cell in same row.
                    // This condition needs to be checked first due to bottom left corner cell.
                    c++;
                    up=true;
                } else if (c == 0) {
                    // Reached first columns. Now move to below cell in the same column.
                    r++;
                    up=true;
                } else {
                    // Somewhere in middle. Keep going down diagonally.
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}