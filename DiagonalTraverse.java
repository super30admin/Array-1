// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Problem: https://leetcode.com/problems/diagonal-traverse/

// Three line explanation of solution in plain english

/** 
 * We keep direction variable to track if we are moving up or moving down in the diagonal traversal.
 * if we are moving up diagonally, we reduce the row by 1 and increment the column by 1.
 * if we are moving down diagonally, we increase the row by 1 and decrease the column by 1.
 * 
 * We check for boundary conditions when row or col goes out of bound and flip the direction accordingly.
 */


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        int i=0;
        int j=0;
        
        int dir = 1; // up
        
        int[] result = new int[rows * cols];
        
        int index = 0;
        
        while(i < rows && j < cols) {
            if(dir == 1) {
                // direction is up
                
                result[index++] = mat[i][j];
                
                if(j == cols - 1) {
                    i++;
                    dir = -1;
                } else if (i == 0) {
                    dir = -1;
                    j++;
                } else {
                    i = i - 1;
                    j = j + 1;
                }
            } else if (dir == -1) {
                // direction is down
                
                result[index++] = mat[i][j];
                
                if(i == rows - 1) {
                    j++;
                    dir = 1;
                } else if (j == 0) {
                    dir = 1;
                    i++;
                } else {
                    i = i + 1;
                    j = j - 1;
                }
            }
        }
        
        return result;
    }
}