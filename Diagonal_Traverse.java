//Time complexity: O(n*m)
//Space complexity: O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        
        int N = matrix.length;
        int M = matrix[0].length;
      
        int row = 0, column = 0;
        
     
        int direction = 1;
      
        int[] result = new int[N*M];
        int r = 0;
       
        while (row < N && column < M) {
           
            result[r++] = matrix[row][column];
          
            int new_row = row + (direction == 1 ? -1 : 1);
            int new_column = column + (direction == 1 ? 1 : -1);
         
            if (new_row < 0 || new_row == N || new_column < 0 || new_column == M) {
                
             
                if (direction == 1) {
                    
                 
                    row += (column == M - 1 ? 1 : 0) ;
                    column += (column < M - 1 ? 1 : 0);
                        
                } else {
                    
                 
                    column += (row == N - 1 ? 1 : 0);
                    row += (row < N - 1 ? 1 : 0);
                }
                    
             
                direction = 1 - direction;        
                        
            } else {
                
                row = new_row;
                column = new_column;
            }
        }
        return result;      
    }
}