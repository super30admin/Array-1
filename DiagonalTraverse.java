// Time Complexity : O(m*n),m is number of rows and n is number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        int m = matrix.length, n = matrix[0].length;
        int[] result = new int[m*n];
        int i = 0, j = 0, index = 0;
        int dir = 1;
        
        while(index < m*n) {
            
            result[index] = matrix[i][j];
            if(dir == 1) {
                
                if(j == n-1) {
                    dir = -1;
                    i++;
                }else if(i == 0) {
                    dir = -1;
                    j++;
                } else {
                    i--;
                    j++;
                }
                
            } 
            else
            {
                if(i == m-1) {
                    dir = 1;
                    j++;
                }else if(j == 0) {
                    dir = 1;
                    i++;
                } else {
                    i++;
                    j--;
                }
                
            }
            index++;
        }
        return result;
        
    }
}