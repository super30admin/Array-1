// Time Complexity : O (m * n) m = # of rows, n = # of columns
// Space Complexity : O (1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, faced minor issues while coding


public class diagonalMatrix{

    public static int[] diagonal(int[][] matrix){
        if(matrix == null || matrix.length == 0) return new int[0];
        int r = 0; int c = 0; int dir =  1; int i = 0;
        int m = matrix.length; int n = matrix[0].length;
        int[] result = new int[m*n];
        while(i < m*n){
            result[i] = matrix[r][c];
            i++;
            if(dir == 1){
                if(c == n - 1){
                    dir = -1;
                    r++;
                }else if(r == 0){
                    dir = -1;
                    c++;

                }else{
                    r--; c++;
                }
            }else{
                if(r == m - 1){
                    dir = 1;
                    c++;

                }else if(c == 0){
                    dir = 1;
                    r++;
                }else{
                    r++; c--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8,9}};
        int[] res = diagonal(matrix);
        for(int ele: res){
            System.out.println(ele);
        }
        
    }
}