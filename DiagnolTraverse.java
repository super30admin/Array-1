// Time: O(rows * columns)
// Space: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int columns = mat[0].length;
        boolean dir = true; // true: upwards, false: downwards.
        int[] result = new int[rows * columns];
        int index = 0; // for result
        // Start at 0,0
        int row = 0;
        int column = 0;
        for (int i = 0; i < rows * columns; i ++) { // traverse through entire matrix
            // Add value at current row and column to the result and increment index.
            result[index ++] = mat[row][column];
            if (dir) {
                // moving up
                if (column == columns - 1) {
                    dir = false; // move down
                    row += 1;
                } else if (row == 0) {
                    dir = false; // move down
                    column += 1;
                } else {
                    // move to next diagonal index in upward direction
                    row --;
                    column ++;
                }
            } else {
                // moving down
                if (row == rows - 1) {
                    dir = true; // move up
                    column += 1;
                } else if (column == 0) {
                    dir = true; // move up
                    row += 1;
                } else {
                    // move to next diagonal index in downward direction
                    row ++;
                    column --;
                }
            }
        }
        return result;
    }
}