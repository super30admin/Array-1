// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
1. Every time we reach the boundaries of matrix we change direction
2. If we are not on boundaries we keep on moving in direction and adding the numbers

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new int[0];
        
        int count = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean up = true;
        int[] res = new int[m*n];
        int row = 0, col = 0;
        
        while(count<m*n){
            res[count] = matrix[row][col];
            if(up){
                if(col == n-1){
                    row++;
                    up = false;
                }
                else if(row==0){
                    col++;
                    up = false;
                }
                else{
                    row--;
                    col++;
                }
            }
            else
            {
                if(row == m-1){
                    col++;
                    up = true;
                }
                else if(col == 0){
                    row++;
                    up = true;
                }
                else{
                    row++;
                    col--;
                }
            }
            count++;
        }
        return res;
    }
}