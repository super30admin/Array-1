// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
public class diagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[0];
        int [] result = new int[mat.length * mat[0].length];
        int row = 0; int col = 0;
        int i = 0; int dir = 1;
        while(i < mat.length * mat[0].length){
            result[i] = mat[row][col];
            i++;
            if(dir == 1){
                if(col == mat[0].length - 1){
                    row++;
                    dir = -1;
                }
                else if(row == 0){
                    col++;
                    dir = -1;
                }
                else{
                    col++;
                    row--;
                }
            }
            else{
                if(row == mat.length - 1){
                    col++;
                    dir = 1;
                }
                else if(col == 0){
                    row++;
                    dir = 1;
                }
                else{
                    col--;
                    row++;
                }
            }
        }
        return result;
    }
}
