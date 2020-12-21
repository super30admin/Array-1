public class Solution {
    public int[] FindDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.Length==0)
        {
            return new int[0];
        }
        
        int n = matrix.Length;
        int m = matrix[0].Length;
        
        int row =0;
        int column =0;
        int direction =1;
        int[] result = new int[n*m];
        int r=0;
        
        while(row<n && column < m)
        {
            result[r++] = matrix[row][column];
            int new_row = row + (direction == 1 ? -1:1);
            int new_column = column + (direction == 1 ? 1:-1);
            
            if(new_row<0|| new_row==n || new_column < 0 || new_column ==m)
            {
                if(direction==1)
                {
                    row += (column ==m-1 ? 1:0);
                    column += (column < m -1 ? 1:0);
                }
                else
                {
                    column += (row==n-1 ?1 :0);
                    row += (row < n-1 ?1:0);
                }
                
                direction = 1-direction;
            }
            else
            {
                row = new_row;
                column = new_column;
            }
        }
        return result;
    }
}
