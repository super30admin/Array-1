// Time Complexity : O(mn) where m is the length of the column and n is the length of the row
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

// Diagnol Traverse
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // base condition
        if(matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int dir = 1;
        int [] result = new int[matrix.length * matrix[0].length];
        int index = 0;
        int i = 0, j = 0;
        while(index < matrix.length * matrix[0].length) {
            result[index] = matrix[i][j];
            // moving upward direction
            if(dir == 1) {
                if(j == matrix[0].length - 1) {
                    dir = -dir;
                    i++;
                }
                else if(i == 0) {
                    dir = -dir;
                    j++;
                }
                else {
                    i--;
                    j++;
                }
            }
            // moving in downward direction
            else {
                if(i == matrix.length - 1) {
                    dir = -dir;
                    j++;

                }
                else if(j == 0) {
                    dir = -dir;
                    i++;
                }
                else {
                    i++;
                    j--;
                }
            }
            index++;
        }
        return result;
    }
}
