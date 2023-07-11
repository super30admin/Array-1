// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/**
 * 1. Create a boolean variable direction to keep track of the direction of traversal.
 * 2. If direction is true, traverse up and if direction is false, traverse down.
 * 3. If direction is true, traverse up until row is 0 or col is n-1. If direction is false, traverse down until row is m-1 or col is 0.
 */

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean direction = true; // up - true, down - false
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m*n];

        int row=0, col=0, i=0;
        while(row<m && col<n){
            if(direction){
                while(row>0 && col<n-1){
                    result[i++] = mat[row][col];
                    row--;
                    col++;
                }
                result[i++] = mat[row][col];
                if(col == n-1){
                    row++;
                }else{
                    col++;
                }
            }else{
                while(row<m-1 && col>0){
                    result[i++] = mat[row][col];
                    row++;
                    col--;
                }
                result[i++] = mat[row][col];
                if(row == m-1){
                    col++;
                }else{
                    row++;
                }
            }
            direction = !direction;
        }

        return result;
    }
}