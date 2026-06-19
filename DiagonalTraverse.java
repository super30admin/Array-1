// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Traverse the matrix one element at a time while alternating between upward-right and downward-left directions.
// When the traversal hits a boundary, move to the next valid starting cell and flip the direction.
// Store each visited element in the result array until all rows * cols elements are processed.

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];

        boolean isUpward = true;
        int row = 0, col = 0;

        for(int i = 0; i < rows * cols; i++) {
            result[i] = mat[row][col];

            if(isUpward) {
                if(col == cols - 1) {
                    row++;
                    isUpward = false;
                } else if(row == 0) {
                    col++;
                    isUpward = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if(row == rows - 1) {
                    col++;
                    isUpward = true;
                } else if(col == 0) {
                    row++;
                    isUpward = true;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}