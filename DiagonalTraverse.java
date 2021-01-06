// Time Complexity : O(R*C)
// Space Complexity : O(R*C)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Using the direction variable, and figuring out the possible edge cases.

// Your code here along with comments explaining your approach


class Solution {
  public int[] findDiagonalOrder(int[][] matrix) {
      if(matrix == null || matrix.length == 0) {
          return new int[0];
      }
      int[] output = new int[matrix.length*matrix[0].length];
      int row = 0, col = 0, dir = 1;
      int resultIndex = 0;
      while(row < matrix.length && col < matrix[0].length){
          output[resultIndex++] = matrix[row][col];
          if(dir == 1){
              if(col == matrix[0].length-1){
                  row++;
                  dir = -1;
              }else if(row == 0){
                  dir = -1;
                  col++;
              }else{
                  row--;
                  col++;
              }
          }else if(dir == -1){
              if(row == matrix.length-1){
                  col++;
                  dir = 1;
              }else if(col == 0){
                  dir = 1;
                  row++;
              }else{
                  row++;
                  col--;
              }
          }
      }
      return output;
  }
}