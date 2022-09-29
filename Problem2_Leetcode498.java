// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat[0].length == 0) return new int[]{};

        int m = mat.length;
        int n = mat[0].length;

        int dir = 1;
        int r = 0, c = 0, k = 0;
        int[] res = new int[m*n];

        while(r < m && c < n) {
            // record current element
            res[k] = mat[r][c];
            // increase the index of result array to store next value
            k++;

            // move to next element
            // for up direction dir = 1
            if(dir == 1){
                // column reaches at end
                if(c == n - 1) {
                    dir = -1;
                    r++;
                }
                else if(r == 0) { // row reaches to start index 0
                    dir = -1;
                    c++;
                }
                else {
                    r--;
                    c++;
                }
            }
            else { // for down direction -1
                if(r == m - 1) { //row reaches end
                    dir = 1;
                    c++;
                }
                else if(c == 0) { // column reaches to start
                    dir = 1;
                    r++;
                }
                else {
                    r++;
                    c--;
                }
            }
        }

        return res;
    }
}