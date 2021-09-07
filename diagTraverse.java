// Time Complexity : O(m*n)
// Space Complexity : O(1), using result array itself
// Did this code successfully run on Leetcode : Yes. 
// Three line explanation of solution in plain english
/**
 * Start with direction going upwards and then when boundary is reached, increase col and start going downwards.
 * Traversal is with row/col manipulation depending on the direction.
 * Check for edge cases using the boundaries of the matrix.
 */

public class diagTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int numRows = mat.length;
        int numCols = mat[0].length;
        
        int[] result = new int[numRows * numCols];
        int row = 0;
        int col = 0;
        int k = 0; //keep track of how many elements we have filled in result
        int dir = 1; // 1 is upwards, -1 downwards

        while(k < numCols * numRows){
            result[k] = mat[row][col];
            k++;
            if (dir == 1) {
                if(col == numCols - 1){
                    row++; 
                    dir = -1;
                }
                else if(row == 0){
                    col++;
                    dir = -1;
                }
                else{
                    row--;
                    col++;
                }

            }

            else {
                if(row == numRows - 1){
                    col++; 
                    dir = 1;
                }
                else if(col == 0){
                    row++;
                    dir = 1;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return result;
    }

}
