// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class DiagonalTraversalSolution {
    public static int[] findDiagonalOrder(int[][] mat) {
        //up -> 1 
        //down -> 0
        int direction = 1;
        int row = 0;
        int column = 0;
        int i = 0;
        int[] diagonalTraversal = new int[mat.length * mat[0].length];
        
        while(i < mat.length * mat[0].length) {
            
            diagonalTraversal[i] = mat[row][column];
            i++;
            
            if (direction == 1) { //up
                if(column == mat[0].length-1) {
                    row++;
                    direction = 0;
                }
                else if(row == 0) {
                    column++;
                    direction = 0;
                }
                else {
                    row--;
                    column++;
                }
            } 
            else { //down
                if(row == mat.length-1) {
                    column++;
                    direction = 1;                
                }
                else if(column == 0) {
                    row++;
                    direction = 1;
                } 
                else {
                    row++;
                    column--;
                }
            }  
       }
       return diagonalTraversal;  
   }

   public static void main(String[] args) {
       int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int[] result = new int[matrix.length * matrix[0].length];
       result = findDiagonalOrder(matrix);
       for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
       }
   }
}