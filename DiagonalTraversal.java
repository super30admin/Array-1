/**
Time complexity: O(n*m)
Space complexity: O(1)
Execute successfully on Leetcode: Yes
Any problems faced: No
*/

class Solution {
    /**
    Approach:
    - 2 things to consider:
      * Changings directions
      * when to change directions
    - Have a dirs variable.
      * dirs = 1 -> Moving upward
      * dirs = -1 -> Moving downward
    - Handle the conditions when we are in the first and last rows and first and last columns.
    */
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[] output = new int[m * n];
        int index = 0;
        
        int i = 0; int j = 0; int dirs = 1;
        
        while(index < m*n) {
            output[index] = matrix[i][j];
            index += 1;
            
            if(dirs == 1) {
                if(j == m-1) {
                    dirs = -1;
                    i += 1;
                } else if(i == 0) {
                    dirs = -1;
                    j += 1;
                } else {
                    i -= 1;
                    j += 1;
                }
            } else {
                if(i == n-1) {
                    dirs = 1;
                    j += 1;
                } else if(j == 0) {
                    dirs = 1;
                    i += 1;
                } else {
                    i += 1;
                    j -= 1;
                }
            }
        }
        return output;
    }
}
