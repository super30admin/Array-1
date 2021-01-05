// Time Complexity : O(R*C)
// Space Complexity : O(R*C)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Figuring out pattern where all values in same diagonal share same sum value of x idnex and y index. 

// Your code here along with comments explaining your approach


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return new int[0];
        } 

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] res = new int[rows * cols];
        int r = 0;
        int c = 0;
        for (int i = 0; i < rows * cols; i++) {
          res[i] = matrix[r][c];
          // even sum diagonal
          if ((r + c) % 2 == 0) {
            if (r - 1 >= 0 && c + 1 < cols) {
              c = c + 1;
              r = r - 1;
            } else if (r - 1 < 0 && c + 1 < cols) {
              c = c + 1;
            } else if (r + 1 < rows && c + 1 > cols - 1) {
              r = r + 1;
            }
          }
          // odd sum diagonal
          else if ((r + c) % 2 != 0) {
            if (r + 1 < rows && c - 1 >= 0) {
              c = c - 1;
              r = r + 1;
            } else if (r + 1 < rows && c - 1 < 0) {
              r = r + 1;
            } else if (r + 1 > rows - 1 && c +1 < cols) {
              c = c + 1;
            }
          }
        }
        return res;
    }
}