// Time Complexity = O(m*n)
// Space Complexity = O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Logic: Here we iterate over the input matrix and manipulate the indexes and filling the result array.
// We need to change course of the upward traversal when we hit one of these 2 cases: 1) Its the last coloumn 2) Its the 0th row
// We need to change course of the downward traversal when we hit one of these 2 cases: 1) Its the first coloumn 2) Its the last (n-1) row

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[]{};
        int i=0, j=0;
        int dir=1;  // Initialize the direction to 1 since we will go upwards first
        int m=mat.length;
        int n=mat[0].length;
        int[] result = new int[m*n];

        // Itterate over the mat array and update the result array by manipulating i, j and index value
        for (int index=0; index < m*n; index++) {
            // Update the result with the input matrix at i, j index
            result[index] = mat[i][j];

            // For the upward direction
            if (dir == 1) {
                if (j == n-1) {
                    dir = -1;
                    i++;
                }
                else if (i == 0) {
                    dir = -1;
                    j++;
                }
                else {
                    j++;
                    i--;
                }
            }
            // For the downward direction
            else {
                if (i == m-1) {
                    dir = 1;
                    j++;
                }
                else if (j == 0) {
                    dir = 1;
                    i++;
                }
                else {
                    i++;
                    j--;
                }
            }
        }

        return result;
    }
}