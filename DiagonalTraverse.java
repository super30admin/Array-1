//Time complexity: O(M*N)
//Space complexity: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int k = 0;
        int dir = 1;
        int row = 0, col = 0;
        while(k < m*n) {
            result[k] = mat[row][col];
            k++;
            //if we are moving upwards
            if(dir == 1) {
                //if it is the last col, then we have to change the row and move downwards
                if(col == n-1) {
                    row++;
                    dir = -1;
                }
                //if it is the first row, then we have to change the column and move downwards
                else if(row == 0) {
                    col++;
                    dir = -1;
                }
                else {
                    row--;
                    col++;
                }
            }
            //if we are moving downwards
            else {
                if(row == m-1) {
                    col++;
                    dir = 1;
                }
                else if(col == 0) {
                    row++;
                    dir = 1;
                }
                else {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}