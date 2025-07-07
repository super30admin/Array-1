//Time Complexity (TC): O(m × n) — Every element in the matrix is visited exactly once.
//Space Complexity (SC): O(1) —  no extra space is used.

//Use two pointers `row` and `col` to track the current position in the matrix while filling the result array.
//Move diagonally up-right or down-left based on the current direction (`movingUp`), switching direction when hitting any matrix boundary.
//Continue this zigzag traversal until all elements are added to the result array.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] diagonalOrder = new int[rows * cols];
        int row = 0, col = 0;

        boolean movingUp = true;

        for (int i = 0; i < rows * cols; i++) {
            diagonalOrder[i] = mat[row][col];

            if (movingUp) {
                if (col == cols - 1) {
                    row++;
                    movingUp = false;
                } else if (row == 0) {
                    col++;
                    movingUp = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == rows - 1) {
                    col++;
                    movingUp = true;
                } else if (col == 0) {
                    row++;
                    movingUp = true;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return diagonalOrder;
    }
}
