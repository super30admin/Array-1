// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    We define 2 directions, and in each direction we define the edge cases and base cases and traverse as needed.
*/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int [m*n];
        int i = 0;
        int r = 0;
        int c = 0;
        int dir = 1;
        while (i < m*n){
            result[i] = mat[r][c];
            if (dir == 1){
                if (c == n-1){
                    r++; 
                    dir = -1;
                }
                else if (r == 0){
                    c++;
                    dir = -1;
                }
                else {
                    r--;
                    c++;
                }
            }
            else {
                if (r == m-1){
                    c++;
                    dir=1;
                }
                else if (c == 0){
                    r++;
                    dir=1;
                }
                else{
                    r++;
                    c--;
                }
            }
            i++;
        }
        return result;
    }
}