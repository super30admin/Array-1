// Time Complexity : o(mn) ---- mn is length of matrix
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = 0, col = 0, dir = 1, i=0;
        int m = mat.length, n = mat[0].length; 
        int result[] = new int[m*n];
        while(i < m*n){
            result[i] = mat[row][col];
            if(dir == 1){
                if(col == n-1){
                    row = row + 1;
                    dir = -1;
            }
                else if(row == 0){
                    col = col + 1;
                    dir = -1;
                }
                
                else{
                    row = row - 1;
                    col = col + 1;
                }
        }
            else{
                if(row == m-1){
                    col = col + 1;
                    dir = 1;
                }
                else if(col == 0){
                    row = row + 1;
                    dir = 1;
                }
                else{
                    row = row + 1;
                    col = col - 1;
                }
            }
            i++;
     }
        return result;
    }
}