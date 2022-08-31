// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // null case
        if (mat == null || mat.length == 0)
            return new int[0];
        
        int m = mat.length;
        int n = mat[0].length;
        int r = 0;
        int c = 0;
        int dir = 1; // tracks the direction of tracing. 1 => up & -1 => down
        int[] res = new int[m*n];
        int idx = 0;
        
        while (idx < m*n) {
            res[idx] = mat[r][c];   // add the current element
            idx++;
           if (dir == 1){
                //upward direction
                if (c == n-1) { // column reached the boundary 
                    r++;    //move to next row to find the head of the diagonal, directly below
                    dir = -1;   
                } else if (r == 0) {    // column boundary is not reached 
                    c++;    // continue to find the head of diagonal in next column in same row
                    dir = -1;
                } else {    // trace the upward diagonal
                    r--;
                    c++;
                }

            }else {
                // downward direction
                if (r == m-1) { // row reached the boundary 
                    c++;        //move to next column to find the head of the diagonal, adjacent
                    dir = 1;
                } else if (c == 0) { // row boundary is not reached 
                    r++;        // continue to find the head of diagonal in next row in same column
                    dir = 1;
                } else {    // trace the downward diagonal
                    c--;
                    r++;
                }
            } 
        }
        return res;
    }
}
