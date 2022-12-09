// Time Complexity : O(mn)
// Space Complexity :O(mn)

/*
 * here we are taking a direction and when the direction is true we move upwards 
 * and if it is false we move down. As we move we are also storing the elements
 * in an array.
 */

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[] {};
        boolean dir = true;
        int idx = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int col = 0;
        int row = 0;
        while(idx < m*n){
            result[idx] = mat[row][col];
            idx++;
            if(dir){
                if(col == n-1){
                    row++;
                    dir = false;
                }
                else if(row == 0){
                    col++;
                    dir = false;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row == m-1){
                    col++;
                    dir = true;
                }
                else if(col == 0){
                    row++;
                    dir = true;
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
