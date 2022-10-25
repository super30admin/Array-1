// Time Complexity : 2ms (faster 99% submission)
// Space Complexity : 55MB (submission of 32%)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {

    private static int up = 0, down = 1;

    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length, n = mat[0].length;

        int[] arr = new int[m * n];

        int direction = up;

        int index = 0;
        int row = 0, col = 0;

        while (index != m * n) {

            arr[index] = mat[row][col];
            index++;

            if (direction == up) {

                if (col == n - 1) {
                    direction = down;
                    row++;
                } else if (row == 0) {
                    direction = down;
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {

                if (row == m - 1) {
                    direction = up;
                    col++;
                } else if (col == 0) {
                    direction = up;
                    row++;
                } else {
                    col--;
                    row++;
                }

            }

        }
        return arr;

    }
}