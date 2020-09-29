// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
     
      if(matrix == null || matrix.length ==0 || matrix[0].length ==0)
          return new int[0];
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] output = new int[rows*cols];
        
        
        int direction = 1;
        int output_index = 0;
        
        int row = 0;
        int col = 0;
        
        while(row < rows && col < cols)
        {
            output[output_index++] = matrix[row][col];
            int new_row = row + (direction ==1?-1:1);
            int new_col = col + (direction ==1?1:-1);
            
            if ( new_row < 0 || new_row == rows || new_col < 0 || new_col == cols)
            {
                if ( direction ==1)
                {
                   row += (col ==cols-1)?1:0 ;
                    col += (col < cols-1)?1:0 ;
                }
                else
                {
                    col += (row ==rows-1)?1:0 ;
                    row += (row < rows-1)?1:0 ;
                    
                }
                direction = 1-direction;
            }
            else
            {
                row = new_row;
                col = new_col;
            }
        }
        
        return output;
        
    }
}