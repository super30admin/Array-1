/**LC-498
 * Time Complexity : O(m*n)
 * Space Complexity : O(1) since we are returning the result array...it is not considered as an auxiliary space
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 *
 Algorithm: (First think of the logic and then think of the edge cases)
 1. Here I have used dir variable to keep track of upward or downward direction
 2. According to the dir, I have incremented i and j pointer to the original matrix.
 */
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        //edge
        if(matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        int i = 0;
        int j = 0;
        int idx = 0;
        int dir = 1;
        while(idx < m*n){

            result[idx] = matrix[i][j];
            if(dir == 1){
                if(j == n - 1) {
                    i++;
                    dir = -1;
                }
                else if(i == 0){
                    j++;
                    dir = -1;
                }
                else{
                    i--;
                    j++;
                }
            }

            else{
                if(i == m - 1) {
                    j++;
                    dir = 1;
                }
                else if(j == 0){
                    i++;
                    dir = 1;
                }
                else{
                    j--;
                    i++;
                }
            }
            idx++;
        }

        return result;

    }
}