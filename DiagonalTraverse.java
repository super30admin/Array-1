// Time Complexity : O(m*n) , m = no. of rows, n = no. of columns 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        int r = 0; 
        int c = 0;
        int dir = 1; 
        int i = 0; 
        
        while(i <= m*n-1) {
        if(dir == 1){
            
            if(c == n-1) {
                result[i] = matrix[r][c];
                r++;
                i++; 
                dir = -1; 
                
            } 
            
            else if (r == 0) {
                result[i] = matrix[r][c]; 
                c++;
                i++;
                dir = -1;
            }
            
            else{
                result[i] = matrix[r][c];
                r--;
                c++;
                i++; 
            }           
        }
              
        else {
            
            if(r == m-1) {
                result[i] = matrix[r][c];
                c++;
                i++; 
                dir = 1; 
                
            } 
            
            else if (c == 0) {
                result[i] = matrix[r][c]; 
                r++;
                i++;
                dir = 1;
            }
            
            else{
                result[i] = matrix[r][c];
                r++;
                c--;
                i++; 
            }                
        }
           
        }return result;        
        
    }
}
