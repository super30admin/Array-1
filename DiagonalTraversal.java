// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
// 1: We maintain a boolean flag that holds the value of whether we are traversing upwards or downwards
// 2: For upwards conditions, we increment/decrement the row and column accordingly, while keeping in mind the condition of reaching the last column
// 3: For downwards conditions, we increment/decrement the row and column accordingly, while keeping in mind the condition of reaching the last row
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; // number of columns
        int n = mat[0].length; // number of rows;

        int[] result = new int[m * n];
        int row = 0, col = 0; // pointers to move through matrix array

        boolean flag = true; // starting in upwards direction

        for (int idx = 0; idx < m * n; idx++) {
            result[idx] = mat[row][col];
            if (flag) { // upwards
                if (row == 0 && col != n - 1) {
                    col++;
                    flag = false;
                } else if (col == n - 1) {
                    flag = false;
                    row++;
                } else {
                    row--;
                    col++;
                }
            } else { //downwards
                if (col == 0 && row != m - 1) {
                    row++;
                    flag = true;
                } else if (row == m - 1) {
                    flag = true;
                    col++;
                } else {
                    row++;
                    col--;
                }

            }
        }
        return result;

    }
}