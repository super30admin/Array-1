// Time Complexity : O(row*col)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We maintain flag to see if we ar going diagonally up or down.
// We then check col and row are getting out of bound or not for both up and down.
// Catch here is while going up we check col first reverse will give out of bound error and same vice versa for down.

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] diag = new int[mat.length*mat[0].length];
        int i=0;
        int flag = 1;//up
        int row = 0;
        int col = 0;
        while(i<mat.length*mat[0].length) {
            if(flag==1) {
                if(col == mat[0].length-1) {
                    diag[i] = mat[row][col];
                    row++;
                    flag=0;
                }
                else if(row == 0) {
                    diag[i] = mat[row][col];
                    flag=0;
                    col++;
                }
                else {
                    diag[i] = mat[row][col];
                    col++;
                    row--;
                }
            }
            else {
                if(row==mat.length-1) {
                    diag[i] = mat[row][col];
                    flag=1;
                    col++;
                }
                else if(col == 0) {
                    diag[i] = mat[row][col];
                    row++;
                    flag=1;
                }
                else {
                    diag[i] = mat[row][col];
                    col--;
                    row++;
                }
            }
            i++;
        }
        return diag;
    }
}