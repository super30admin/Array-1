//time o(mn)
//space O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = 0;
        int col = 0;
        int[] res = new int[mat.length*mat[0].length];
        int i = 0;
        int direction = 1;
        
        while(i < mat.length*mat[0].length) {
            res[i] = mat[row][col];
            i++;
            
            
            
            if(direction == 1) {
                if (col == mat[0].length-1) {
                row++;
                direction = 0;
                }
                else if(row == 0) {
                    col++;
                    direction = 0;
                }  else {
                    col++;
                    row--;
                }
            } else {
                if(row == mat.length - 1) {
                    col++;
                    direction = 1;
                } else if(col == 0) {
                    row++;
                    direction=1;
                } else {
                    col--;
                    row++; 
                }
            }
        }
        return res;
    }
}