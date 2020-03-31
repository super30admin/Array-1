// Time complexity : O(m*n)
// Space complexity: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // Edge case
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        
        int dir = 1;
        int n = matrix.length;
        int m = matrix[0].length;
        int[] result = new int[m*n];
        int i = 0; //element pointer
        int row = 0; // row pointer
        int col = 0; // col pointer
        
        while(i < m*n){
            result[i] = matrix[row][col];
            if(dir == 1){
                if(col == m-1){
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
            else{
                if(row == n-1){
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
            i++;            
        }
        return result;
    }
}
