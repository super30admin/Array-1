//TC: O(m*n)
//SC: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int row = mat.length, column = mat[0].length;
        
        int [] result = new int[row * column];
        
        int dir = 1;
        int i=0, j=0, x=0;
        
        
        while(x < result.length) {
            
            result[x] = mat[i][j];
            
            if(dir == 1) {
                
                if(j == column-1){
                    
                    dir = 0;
                    i++;
                    
                    
                }
                else if(i == 0){
                    dir = 0;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
                
                
                
            }
            else{
                
                if(i == row-1){                    
                    dir = 1;
                    j++;
                }
                else if(j == 0){
                    dir = 1;
                    i++;
                }
                else{
                    i++;
                    j--;                    
                }
                
                
            }
            x++;
            
        }
        return result;
        
    }
}