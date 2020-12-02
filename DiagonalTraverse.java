
// TC: O(M*N)
// SC: O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        
        
        if(matrix == null || matrix.length == 0)
            return new int[0];
        
        int m = matrix.length;
        int n = matrix[0].length;
    
        int i = 0,j=0, dir = 1, index = 0;
        int[] result = new int[m*n];
        
        while(index < m*n){
            
            result[index] = matrix[i][j];
            
           if(dir == 1){
                if(j == n-1){
                dir = -1;
                i++;
            } else if( i==0 ){
                dir=-1;
                j++;
            } else{
                i--;
                j++;
            }
           } else{
               if( i == m-1){
                   dir = 1;
                   j++;
               } else if(j == 0){
                   dir =1;
                   i++;
               } else{
                   i++;
                   j--;
               }
           }
            
            index++;
           
            
        }
        
        
        return result;
        
      
    }
}