//Time Complexity : O(n)
//Space Complexity : O(1). No extra space used
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int r = mat.length;
        int c = mat[0].length;
        int i = 0;
        int j = 0;
        int dir = 1;
        int[] result = new int[r*c];
        int z = 0;
         
        
        while(i < r && j < c){
    
            if(dir == 1){
                result[z] = mat[i][j];
                    z++;
                
                if(j == c - 1){
                    
                    i = i + 1;
                    dir = -1;
                }
               else if(i == 0){
                    
                    j = j + 1;
                    dir = -1;
                }
                
                else{
                    
                    i = i - 1;
                    j = j + 1;
                }
            }
            
         else     if(dir == -1){
             
              result[z] = mat[i][j];
                    z++;
                
                if(i == r - 1){
                    
                    j = j + 1;
                    dir = 1;
                }
               else if(j == 0){
                    
                    i = i + 1;
                    dir = 1;
                }
                
                else{
                   
                    i = i + 1;
                    j = j - 1;
                }
            }
        }
        
        return result;
    }
}