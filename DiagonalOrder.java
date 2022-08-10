// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        int[] result = new int[rows*cols];
        int index = 0;
        
        int i = 0;
        int j = 0;
        
        while(i < rows && j < cols) {
            
            // process the upwards diagonal
            while(i >= 0 && j < cols) {
                result[index] = mat[i][j];
                
                i--;
                j++;
                
                index++;
            }
            
            if (i == -1) {
                if (j != cols) {
                   i++;
                }
            }
            if (j == cols) {
                j--;
                i += 2;
            }
            
            // process the downwards diagonal
            while (i < rows && j >= 0) {
                result[index] = mat[i][j];
                
                i++;
                j--;
                
                index++;
            }
            
            if (j == -1) {
                if (i != rows) {
                    j++;
                }
            } 
            
            if (i == rows) {
                i--;
                j += 2;
            }
            
        }
        
        return result;
    }
}