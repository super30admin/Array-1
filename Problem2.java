// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

/**
 * We take a flag to change our traversal direction. We first found out
 * the happy cases for each direction and the condition to be applied
 * at the bounds. That's how we handled potential edge cases.
 */
public class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m*n];
        int row = 0;
        int col = 0;
        boolean dir = true;

        for(int i = 0; i<m*n; i++) {
            res[i] = mat[row][col];

            if(dir) { //Up logic
                if(col == n-1) {
                    row++;
                    dir = false;
                } else if(row == 0) {
                    col++;
                    dir = false;
                } else {
                    row--;
                    col++;
                }
            } else { //Down logic
                if(row == m-1) {
                    col++;
                    dir = true;
                } else if(col == 0) {
                    row++;
                    dir = true;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return res;
    }
}
