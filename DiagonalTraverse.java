// Time Complexity : O(m * n), where m is the number of rows and n is the number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Minor index confusion between rows and columns

// Your code here along with comments explaining your approach:
// We simulate the traversal by maintaining row and column indices.
// We use a boolean flag to track the current direction: upward or downward.
// At each step, based on the direction and boundaries, we update indices accordingly.
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m*n];
        int r = 0;
        int c = 0;
        boolean dirs = true;
        for (int i = 0; i < m*n; i++) {
            result[i] = mat[r][c];
            if(dirs){//Upwards
                if (c == n-1) {
                    r++;
                    dirs = false;
                }else if( r==0){
                    c++;
                    dirs = false;
                }else{
                    r--;
                    c++;
                }
            }else{//Downwards
                if(r == m-1 ){
                    c++;
                    dirs = true;
                }else if(c==0){
                    r++;
                    dirs = true;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}