// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        
        
        if(mat == null || mat.length == 0) return new int[] {};
        int m = mat.length;
        int n = mat[0].length;
        
        int[] result = new int[m*n];
        
        
        //row and col = 0
        int r = 0; 
        int c = 0;
        //Upward Direction = 1 and Downward direction = -1
        int dir = 1;
        
        //Index for. result array
        int idx = 0;
        
        // idx < m*n length
        while(idx < result.length){
            
            //
            result[idx] = mat[r][c];
            
            idx++;
            
            //Upward direction
            if(dir == 1){
                
                //Border of Column that is right side of the matrix, if it reaches 
                // go to next row and change the direction from  upwards to downwards
                if(c==n-1){
                    r++; dir = -1;
                }
                //Border of row that is top of the matrix, if it reaches 
                // go to below row and change the direction from upwards to downwards
                else if(r==0){
                    c++; dir = -1;
                }
                else{
                    r--; c++;
                }
            } 
            //Downward direction
            else{
                
                 //Border of row that is bottom of the matrix, if it reaches 
                // go to next col and change the direction from downwards to upwards
                
                if(r==m-1){ 
                    c++; dir = 1; 
                } 
                
                //Border of column that is left side of the matrix, if it reaches 
                // go to next row and change the direction from downwards to upwards
                else if(c==0){ 
                    r++; dir = 1; 
                } 
                else{
                    c--; r++;
                }
            }
            
            
        }
            return result;
            
        
        
        
    }
}