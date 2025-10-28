// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int row = 0;
        int col = 0;
        boolean direction = true;

        for(int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];
            if(direction) {//move up
                if(col == n - 1) {//reached last column
                    row++;
                    direction = false;
                }
                else if(row == 0) {//reached top row
                    col++;
                    direction = false;
                }
                else {
                    row--; 
                    col++;
                }
            } else {//move down
                if(row == m - 1) {//reached bottom row
                    col++;
                    direction = true;
                }
                else if(col == 0) {//reached first column
                    row++;
                    direction = true;
                }
                else {
                    row++; 
                    col--;
                }
            }
        }
        return result;
    }
}

