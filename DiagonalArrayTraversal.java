// Time Complexity : O(MN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = 0;
        int col = 0;
        int dir = 1;
        int m = mat.length;
        int n = mat[0].length;
        int[] resultantArray = new int[m*n];
        int i=0;
        while(i<m*n)
        {
            resultantArray[i] = mat[row][col];
            //upward
            if(dir == 1) {
                // if we are at the top row and not at the last element,
                // we can keep spinning the value and decline the direction
                if(row == 0 && col != n-1) {
                    col++;
                    dir = -1;
                    //if we are the last column, we will have no more elements to go through beyond,
                    //so pulling the row by 1 down to perform the downward operation
                } else if(col == n-1) {
                    row++;
                    dir = -1;
                } else {
                    //if we are in the middle of matrix, we will keep going up like climbing up staircase
                    row--;
                    col++;
                }
            } else {
                if(col == 0 && row != m-1) {
                    //if we are at the start column, and not reached the floor yet,
                    // then keep reducing the floor down
                    row++;
                    dir = 1;
                } else if(row == m-1) {
                    // if we are in the last row, and no more elements beyond this point,
                    // moving the column index to 1 position right, then perform, climbing up operation
                    col++;
                    dir = 1;
                } else{
                    //if we are in the middle of matrix, we will keep going down like climbing down staircase
                    row++;
                    col--;
                }

            }
            i++;
        }
        return resultantArray;
    }
}