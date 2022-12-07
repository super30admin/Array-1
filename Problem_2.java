// Diagonal Traverse
// Time Complexity : O(mn); m&n are row & column
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// Consider a boolean dir variable. This problem associates with many corner cases, out of bound case
// While going up(top of boundary, the right boundary), down(left boundary, last row)
// 3 cases for while going up(2 boundary case & row--, col++)
// 3 cases for while going down(2 corner case & row++, col--)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0)
            return new int[] {};

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        boolean dir = true; //up
        int idx = 0; //
        int row=0, col=0;

        while(idx < m*n) {
            result[idx] = mat[row][col]; //starting
            idx++;
            if(dir) {
                if(col == n-1){ //hitting the right col
                    row++;
                    dir = false;
                }
                else if(row == 0) {  //hitting last elem of the top
                    col++;
                    dir = false;
                }
                else { //when not hitting boundaries
                    row--;
                    col++;
                }
            }
            else { //down
                if(row == m-1) { //hitting the last row
                    col++;
                    dir = true;
                }
                else if(col == 0) { //hitting last elem of the bottom
                    row++;
                    dir = true;
                }
                else { //when not hitting boundaries
                    col--;
                    row++;
                }

            }

        }
        return result;
    }
}