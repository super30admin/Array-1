// Time Complexity : O(m*n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// Iterate over the matrix until all the rows and columns have reached their boundary limits. That is row has to reach height-1 and column has to reach width-1.
// We set matrix[0][0] manually and then set forward = false. So, the first pass in the while loop is backward.
// During this loop, we set the loop for backward = true. This continues until while loop conditions are satisfied.

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0 ||matrix[0].length ==0) return new int [0];
        
        int height = matrix.length;
        int width  = matrix[0].length;
        int [] result = new int[height*width];
        
        result[0] = matrix[0][0];
        
        int index =1;
        int row=0, col=0;
        boolean forward = false;
        
        while (row < height && col < width) {   
            
            if (forward) {
               if (row == height-1) {
                   col ++;
               } 
                else {
                    row++;    
                }
                
                forward = false;
                while (row >=0 && col < width) {
                    result[index++] = matrix[row--][col++];
                }
                row++;
                col--;
            }
            else {
                if (col == width-1){
                    row ++;
                }
                else {
                    col++;
                }
                forward = true;
                while (row < height && col >= 0) {
                    result[index++] = matrix[row++][col--];
                }
                
                row --;
                col ++;
            }
        }
        return result;
    }
}