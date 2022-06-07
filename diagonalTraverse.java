// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes, I was getting index out of error for second half of matrix

import java.util.Arrays;

class Main {

    public static int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        // to store result;
        int[] result = new int[m * n];
        int row = 0;
        int col = 0;

        // to set direction I am using flag
        int flag = 0;
        int ind = 0;

        // while loope for storing element in result array by given condition
        while (ind < m * n) {
            // if flag == 0 we are going in up direction
            // up direction
            if (flag == 0) {

                // while we reach at top row or last column we are going up
                while (row >= 0 && col < n) {
                    result[ind++] = mat[row][col];
                    row--;
                    col++;
                }

                // here row becomes -1 so I am using increase row by 1
                row++;

                // here for the second half (by middle diagnoal) column will become greater then
                // n -1
                if (col > n - 1) {
                    // here I am increasing the row by one as I want go in down direction
                    row++;
                    // as column become greater then n -1 we are decreasing it
                    col--;
                }
                // for change the direction from up to down
                flag = 1;
                continue;
            }

            // down direction
            if (flag == 1) {

                // while we reach at bottom row or first column we are going down
                while (row < m && col >= 0) {
                    result[ind++] = mat[row][col];
                    row++;
                    col--;
                }
                // here col becomes -1 so I am using increase row by 1
                col++;
                // here for the second half (by middle diagnoal) row will become greater then
                // m -1
                if (row > m - 1) {
                    // as row become greater then n -1 we are decreasing it
                    row--;
                    // here I am increasing the col by one as I want go in up direction
                    col++;
                }

                // for change the direction from down to up
                flag = 0;
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6, },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
    }
}
