// Time Complexity : O(mn), m and n is the size of the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * keep track of the direction to travel diagonally.
 * check out of bound cases and accordingly change the row and col.
 */
// Your code here along with comments explaining your approach
public class diagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {

        if (mat == null || mat.length == 0)
            return new int[] {};

        // rows
        int m = mat.length;
        // col
        int n = mat.length;

        int[] res = new int[m * n];

        // direction variable to check the if the current direction is up or down
        boolean dir = true;

        // resultant array index
        int index = 0;
        // iterate through current matrix
        int row = 0, col = 0;
        while (index < m * n) {
            res[index] = mat[row][col];
            index++;
            // if going up
            if (dir) {
                // check the out of bound conditions
                if (col == n - 1) {
                    row++;
                    dir = false;
                } else if (row == 0) {
                    col++;
                    dir = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    col++;
                    dir = true;
                } else if (col == 0) {
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
