// 498. Diagonal Traverse - https://leetcode.com/problems/diagonal-traverse/
// Time Complexity : O(MN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) 
            return new int[0];
        // direction: up=1, down=-1 
        int dir = 1;
        // length, no. of cols
        int m = mat.length, n = mat[0].length;
        // row, col, index
        int row = 0, col = 0, i = 0;
        
        int[] result = new int[m*n];
        
        while(i < m*n)
        {
            // matrix
            result[i++] = mat[row][col]; // update to next index
            // up direction
            if(dir == 1)
            {
                if(col == n-1)
                {
                    row++;
                    dir=-1;
                }
                else if(row == 0)
                {
                    col++;
                    dir=-1;
                }
                else
                {
                    row--;
                    col++;
                }
            }
            // down direction
            else
            {
                if(row == m-1)
                {
                    col++;
                    dir=1;
                }
                else if(col == 0)
                {
                    row++;
                    dir=1;
                }
                else
                {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}