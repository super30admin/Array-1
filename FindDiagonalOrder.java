// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// 1) Simulate using the direction flag
// 2) Add values to output array until the row and column position is within the bounds
// 3) Keep updating the direction flag whenever there is an overflow

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        boolean dir = false;
        int[] res = new int[n*m];
        int row = 0, col = 0;
        int counter = 0;

        while(row < m && col < n){
            res[counter] = mat[row][col];
            counter++;

            if(dir == false){
                if(col == n-1){
                    dir = true;
                    row++;
                }
                else if(row == 0){
                    dir = true;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row == m-1){
                    dir = false;
                    col++;
                }
                else if(col == 0){
                    dir = false;
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
}

// Your code here along with comments explaining your approach