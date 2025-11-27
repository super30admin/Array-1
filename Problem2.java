// Time Complexity : O(M*N)
// Space Complexity : O(M*N)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
Traverse the matrix diagonally, switching between upward and downward directions.
When moving up, bounce off the top row or last column; when moving down, bounce off the bottom row or first column.
Collect each cell in order while flipping the direction whenever a boundary is hit.
*/

public class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m*n];
        int row = 0;
        int col = 0;
        boolean goingUp = true;

        for(int i = 0;i<m*n;i++) {
            res[i] = mat[row][col];
            if(goingUp) {
                if(col == n-1) {
                    goingUp = false;
                    row++;
                } else if(row == 0) {
                    col++;
                    goingUp = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if(row == m-1) {
                    col++;
                    goingUp = true;
                } else if(col == 0) {
                    row++;
                    goingUp = true;
                } else {
                    col--;
                    row++;
                }
            }
        }

        return res;
    }
}
