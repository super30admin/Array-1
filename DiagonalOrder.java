// Time Complexity : O(m*n) where m and n are rows and columns respectively
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Maintaining a direction which tells us whether we have to up
// or down in the diagonal

import java.util.Arrays;

class DiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[m*n];

        if(mat == null) return new int[0];
        int i = 0; int j = 0; int dir = 1;
        int idx = 0;

        while(idx < m*n){
            result[idx] = mat[i][j];
            idx++;
            if(dir == 1){
                if(i==0 && j!=n-1){
                    j++;
                    dir=-1;
                }
                else if(j==n-1){
                    i++;
                    dir=-1;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(j==0 && i!=m-1){
                    i++;
                    dir = 1;
                }
                else if(i == m-1){
                    j++;
                    dir = 1;
                }
                else{
                    j--;
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String [] args){
        int [][] matrix = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        DiagonalOrder d = new DiagonalOrder();
        System.out.println(Arrays.toString(d.findDiagonalOrder(matrix)));
    }
}