// Time Complexity : O(m * n)
// Space Complexity : O(m * n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We have three edge cases
// 1. 
// Your code here along with comments explaining your approach
import java.util.Arrays;

public class Problem2 {
    public static void main(String args[]) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        
        int[] res = new int[mat.length*mat[0].length];
        int dir = 1;
        int row = 0;
        int col = 0;
        int m = mat.length;
        int n = mat[0].length;
        res[0] = mat[row][col];
        for(int i = 1; i < res.length;) {
            if (dir == 1){
                // top right corner
                if(row == 0 && col != n-1){
                    col++; dir = -1;
                }
                //right corner  
                else if(col == n-1){
                    row++; dir = -1;
                }
                else{
                row--;
                col++;
                }
            }
            else{
                //bottom left corner
                if(row == m-1){
                        col++; dir = 1;
                }
                //left corner
                else if(col == 0) {
                        row++; dir = 1;
                }
                else {
                    row++;
                    col--;
                }    
                        
            }
           res[i] = mat[row][col]; 
            i++;
            }
            return res;
        
    }
}
