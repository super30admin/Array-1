// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Traversing through the matrix in the way that is shown in the question. Using a boolean falg to determin if we have to go right or left diagonally. Handling edge cases using if and else

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        // Output array
        int[] result = new int[(m * n)];
        // Flag user to determine whether to go right or left
        Boolean flag = true;
        int i = 0;
        int j = 0;

        for (int k = 0; k < result.length; k++) {
            result[k] = mat[i][j];
            // Conditions for going right
            if (flag) {
                if (i == 0 && j == n - 1) {

                    i++;
                    flag = false;
                } else if (i == 0) {
                    j++;

                    flag = false;
                } else if (j == n - 1) {
                    i++;

                    flag = false;
                } else {

                    i--;
                    j++;
                }
            }

            // Conditions for going left
            else {
                if (j == 0 && i == m - 1) {

                    j++;
                    flag = true;
                } else if (j == 0) {

                    i++;
                    flag = true;
                } else if (i == m - 1) {
                    j++;

                    flag = true;
                } else {
                    j--;
                    i++;
                }
            }
        }

        return result;
    }
}