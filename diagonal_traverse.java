class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        int rows = matrix.length;
        int cols =  matrix[0].length;
        int[] output = new int[rows*cols];
        
        int row = 0, col=0, direction=1, start=0;
        
        while(row < rows && col < cols){
            output[start++] = matrix[row][col];
            int new_row = row+ (direction==1 ? -1 : 1);
            int new_col = col + (direction == 1 ? 1 : -1);
            // Boundary condition
            if(new_row < 0 || new_col== cols || new_col < 0 || new_row == rows){
                
                if(direction == 1)
                {
                    // new_row = -1 here so col is the deciding factor
                    row = row + (col== cols-1 ? 1 : 0);
                    col = col + (col < cols-1 ? 1:0);
                }
                else{
                    // new_col = cols here so row is the deciding factor
                    col = col + (row == rows -1 ? 1:0);
                    row = row + (row < rows-1 ? 1 : 0);
                }
                 // Change the direction 
                direction = 1-direction;
            }
            else
            {
                // Continue in the same direction, for the non-boundary elements
                row = new_row;
                col = new_col;
            }
        }
        
        return output;
    }
}

// TC- O(rows*cols)- since each of the elements is accessed
// SC- O(1)- since no additional memory is used apart from given
/* Logic
- Assume a direction flag that shows upward and downward traversal
- At the end of each direction we hit two kinds of boundary conditions.
    - When going upwards, either the row boundary is hit and col is still present (increment col, with same row) in same row or cols are done (increment row, with same col)
    - When going downwards, either cols are over and more rows are present ( increment row and keep same column). The second case is when rows are over and more colums are present ( increment col and keep same row)
    - After updating row, col, change the direction
- If boundary condition is not hit then new_row and new_col updated according to direction will be row and col.
*/
