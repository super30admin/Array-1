/*
TC : O(m*n) where m*n  is the size of the matrix
SC : O(1)
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No
 */


/**
 * The approach is based on following facts :
 * All the elements in the same diagonal have equal value of row index + col index
 * Direction of the diagonal is decided based on whether the sum is odd or even
 * 3 cases in each direction :
 * 1)Still room to go in that direction
 * 2)out of rows to travel, but cols are remaining
 * 3)out of cols to travel but rows remaining
 */
public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int rows = matrix.length, cols = matrix[0].length;
        int[] res = new int[rows * cols];
        int r = 0, c = 0;

        for (int i = 0; i < rows * cols; i++)
        {
            res[i] = matrix[r][c];
            // even sum diagonal
            if ((r + c) % 2 == 0)
            {
                if (r - 1 >= 0 && c + 1 < cols) {
                    r = r - 1;
                    c = c + 1;
                } else if (c + 1 < cols) {
                    c = c + 1;
                } else {
                    r = r + 1;
                }
            }
            // odd sum diagonal
            else if ((r + c) % 2 != 0)
            {
                if (r + 1 < rows && c - 1 >= 0) {
                    r = r + 1;
                    c = c - 1;
                } else if (r + 1 < rows) {
                    r = r + 1;
                } else {
                    c = c + 1;
                }
            }
        }
        return res;
    }
}
