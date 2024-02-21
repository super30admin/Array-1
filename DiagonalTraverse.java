// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Approach - Use a flag and increment pointers to move in upward/downward direction in the matrix

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int r = mat.length; // Number of rows
        int c = mat[0].length; // Number of columns
        int[] result = new int[r * c];
        int i = 0;
        int j = 0;
        boolean dirFlag = true;

        for (int idx = 0; idx < r * c; idx++) {

            result[idx] = mat[i][j];

            // If its upward direction
            if (dirFlag) {
                if (j == c - 1) {
                    i++;
                    dirFlag = false;
                } else if (i == 0) {
                    j++;
                    dirFlag = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == r - 1) {
                    j++;
                    dirFlag = true;
                } else if (j == 0) {
                    i++;
                    dirFlag = true;
                } else {
                    i++;
                    j--;
                }
            }
        }

        return result;

    }
}