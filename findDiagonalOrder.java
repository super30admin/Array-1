// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// We use a direction variable (1 for upward, -1 for downward) to zigzag through the matrix.
// Based on current row and column, we decide the next position and when to change direction.
// We keep collecting elements into a result array until we’ve covered all matrix cells.


import java.util.Arrays;

public class findDiagonalOrder {
    public int[] solve(int[][] mat){
        if(mat==null || mat.length==0){
            return new int[] {};
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int idx = 0;
        int row = 0;
        int col = 0;
        int dir = 1;
        
        while(idx<m*n){
            res[idx] = mat[row][col];
            idx++;
            if(dir == 1){
                if(col==n-1){
                    dir=-1;
                    row++;
                }
                else if(row==0){
                    dir=-1;
                    col++;

                }
                else{
                    row--;
                    col++;
                }

            }
            else{
                if(row == m-1){
                    dir = 1;
                    col++;

                }
                else if(col == 0){
                    dir=1;
                    row++;
                }
                else{
                    row++;
                    col--;
                }

            }
        }
        return res;


    }
    public static void main(String[]args){
        findDiagonalOrder ob = new findDiagonalOrder();
        int[][] mat1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] mat2 = {
            {1,2},
            {3,4}
        };
        int [] res = ob.solve(mat1);
        int [] res2 = ob.solve(mat2);
        System.out.println("Diagonal Order :" + Arrays.toString(res));
        System.out.println("Diagonal Order :" + Arrays.toString(res2));
    }
    
}
