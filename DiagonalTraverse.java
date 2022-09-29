// Time Complexity :O(M*N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0)
            return new int[] {};
        int N = mat.length;
        int M = mat[0].length;
        
        int row = 0;
        int column = 0;
        int d = 1;
        int[] result = new int[M*N];
        int r = 0;
        
        while(row < N && column < M){
            result[r++] = mat[row][column];
            int new_row = row + (d == 1 ? -1 : 1);
            int new_column = column + (d == 1 ? 1 : -1);
            
            if(new_row < 0 || new_row == N || new_column < 0 || new_column == M){
                if(d == 1){
                    row += (column == M - 1 ? 1 : 0);
                    column += (column < M - 1 ? 1 : 0);
                }
                else{
                    column += (row == N - 1 ? 1 : 0);
                    row += (row < N - 1 ? 1 : 0);
                }
                d = 1 - d;
            }
            else{
                row = new_row;
                column = new_column;
            }
        }
        return result;
    }
}
