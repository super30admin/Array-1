class Solution {// time and space is O(row * col) if not considering output as storage then space                   //constant
    public int[] findDiagonalOrder(int[][] matrix) {
        //base case check
        if(matrix == null  || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        
        int rows = matrix.length ;
        int cols = matrix[0].length;
        int[] output = new int[rows*cols];
        // up direction for 1 and 0 for down direction
        int direction = 1 ;
        // just putting val and incrementing the 
        int output_index = 0;
        //base to start traversing 
        int row = 0;
        int col = 0;
        
        while(row< rows && col < cols){
            output[output_index++] = matrix[row][col];
            int new_row = row + (direction ==1 ? -1 : 1) ;
            int new_col = col + (direction ==1 ? 1 : -1) ;
            
            //boundary conditions
            if(new_row<0 || new_row == rows || new_col<0 || new_col == cols){
                if(direction == 1){
                    // only row or column only one will be updating at a time
                    row += (col == cols-1 ?1: 0);
                    col += (col < cols-1 ? 1 : 0) ;
                }else{
                    col += (row == rows-1 ? 1:0);
                    row += (row < rows-1 ? 1:0);
                }
                direction = 1 - direction ; 
            }else{
                row = new_row ;
                col = new_col ;
            }
        }
        return output;
    }
}