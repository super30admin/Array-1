// Time Complexity : O(MN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0)
            return new int[0];
        
        int dir = 1;
        int m = mat.length, n = mat[0].length;
        int row = 0, col = 0, i = 0;
        
        int[] result = new int[m*n];
        
        while(i < m * n){
            //up direction
            result[i] = mat[row][col]; //updating
            if(dir == 1){
                if(col == n - 1){
                    row++;
                    dir = -1;
                }
                else if(row == 0){
                    col++;
                    dir = -1;
                }
                else{
                    row--;
                    col++;
                }
            }
            //down direction
            else{
                if(row == m - 1){
                    col++;
                    dir = 1;
                }
                else if(col == 0){
                    row++;
                    dir = 1;
                }
                else{
                    row++;
                    col--;
                }
            }
            i++;
        }
        return result;
    }
}