/*
O(m*n)
*/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int dir = 1;
        
        int m = mat.length;
        int n = mat[0].length;
        int  k = 0;
        
        int i =0;
        int j = 0;
        int [] result = new int[m*n];
        
        
        while(k<m*n){
            result[k] = mat[i][j];
            k++;
            if (dir == 1){
                if (j == n-1){
                
                    i++;
                    dir = -1;
                
                }
                else if( i == 0){
                
                    j++;
                    dir = -1;
                
                }
                
                else{
                  //k++;
                  i--;
                  j++;
                    
                    
                }
            
            }
            else{
                if (i == m-1){
                
                    j++;
                    dir = 1;
                
                }
                else if( j == 0){
                
                    i++;
                    dir = 1;
                
                }
                
                else{
                 // k++;
                  i++;
                  j--;
                    
                    
                }
                
            }
            
        }
        return result;
        
    }
}