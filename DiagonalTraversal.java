// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Keeping up and down pointers to identify which direction we are traversing the matrix. Whenever we reach the
// end of the diagonals we switch the direction and go to next diagonal and traverse that diagonal. We do these
// steps until we reach the last element(bottom right) of matrix.

// Your code here along with comments explaining your approach
public class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return new int[0];
        int n = matrix[0].length;
        if (n == 0) return new int[0];
        int total = m * n;
        int[] result = new int[total];

        int row = 0;
        int col = 0;
        int i = 0;
        int dir = 0;
        while (i < total) {
            result[i] = matrix[row][col];
            if (dir == 0) {
                if (col == n - 1) {
                    dir = 1 - dir;
                    row += 1;
                } else if (row == 0) {
                    dir = 1 - dir;
                    col += 1;
                } else {
                    row -= 1;
                    col += 1;
                }
            } else {
                if (row == m - 1) {
                    dir = 1 - dir;
                    col += 1;
                } else if (col == 0) {
                    dir = 1 - dir;
                    row += 1;
                } else {
                    col -= 1;
                    row += 1;

                }

            }

            i++;
        }

        return result;
    }
}
