// Time Complexity :O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english :We use a boolean variable dir to decide whether to move up-right or down-left along the diagonals. When the traversal hits a boundary (top row, bottom row, left column, or right column), it changes direction and adjusts the row or column accordingly until all elements are visited.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] output = new int[m*n];
        int row =0;
        int col =0;
        // If this is true we go up and if this is false we go down
        boolean dir = true;
        for(int i=0; i<output.length; i++) {
            output[i] = mat[row][col];
            if(dir) {
                if(col == n-1) {
                    row++;
                    dir= false;
                } else if (row == 0) {
                    col ++;
                    dir = false;
                } else {
                    row --;
                    col ++;
                }
            } else {
                if (row == m-1) {
                    col++;
                    dir = true;
                } else if (col ==0) {
                    row++;
                    dir = true;
                } else {
                    row++;
                    col --;
                }
            }
        }
        return output;
        
    }
}
