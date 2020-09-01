// Time Complexity : O (N x M) where N is number of rows and M is columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
                //Just keep track of when to change direction.
                //And accordingly change the pointers.

public class DiagonalArrayTraversal {
    class Solution {
        public int[] findDiagonalOrder(int[][] matrix) {
            if(matrix.length == 0) {
                return new int[0];
            } else if(matrix.length == 1) {
                return matrix[0];
            }
            
            int[] serial = new int[matrix.length * matrix[0].length];
            int x = 0, i = 0, j = 0;
            boolean goingUp = true;
            
            while(x < matrix.length*matrix[0].length) {
                serial[x++] = matrix[i][j];
                if(goingUp) {
                  if(j == matrix[0].length-1) {
                      goingUp = false;
                      i++;
                  } else if (i == 0) {
                      goingUp = false;
                      j++;
                  } else {
                      i--;j++;; 
                  }
                } else {
                   if(i == matrix.length-1) {
                      goingUp = true;
                      j++;
                  } else if (j == 0) {
                      goingUp = true;
                      i++;
                  } else {
                      i++;j--; 
                  }
                }
            }
            
            return serial;
        }
    }
}