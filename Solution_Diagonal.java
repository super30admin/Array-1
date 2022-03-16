/*

// Time Complexity : O(n *m) where is the m is the number of rows and n is number of columns.

// Space Complexity : O(1) as we are not using any auxillary data structure.

// Did this code successfully run on Leetcode : Yes.

*/

public class Solution_Diagonal {

    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        // maintaing the poineter

        int idx = 0;

        int i = 0, j = 0;

        // checking condition

        boolean dir = true;

        while (idx < m * n) {

            // adding elements in the result array.

            result[idx++] = mat[i][j];
            // if true
            if (dir) {

                // checking if column j has at last index
                if (j == n - 1) {
                    // changing the directions
                    dir = false;
                    i++;

                } else if (i == 0) {

                    dir = false;
                    j++;
                } else {

                    i--;
                    j++;
                }
            } else {

                // checking if column i has at last index
                if (i == m - 1) {
                    dir = true;
                    j++;
                } else if (j == 0) {
                    dir = true;
                    i++;
                }
                // if each condition is failed then increment the i and j.
                else {

                    j--;
                    i++;
                }

            }
        }

        return result;
    }
}
