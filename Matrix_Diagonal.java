class Solution {
    /*
     * Time - O(m*n)
     * Space - O(1)
     */
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        
        int dir=1;
        int counter = 0;
        int row = 0, col = 0;
        while (counter < m*n) {
            result[counter] = mat[row][col];
            counter++;
            if (dir == 1) {
                // handle boundary condition where row is 0 and col is n-1
                if (row == 0 && col != n-1) {
                    col++;
                    dir = -1;
                } 
                else if (col == n-1) {
                    row++;
                    dir = -1;
                }
                else {
                    row--;
                    col++;
                }
            }
            else {  //dir == -1
                // handle boundary condition where col is 0 and row is m-1
                if (col == 0 && row != m-1) {
                    row++;
                    dir = 1;
                }
                else if (row == m-1) {
                    col++;
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