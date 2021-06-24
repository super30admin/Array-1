// Time Complexity : O(N*M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // using a direction variable, let dir = 1 for upward direction and dir = -1 for downward direction
        // check if we reached corner, then we change dir value and do either i++ or j++
        // else if we are in middle then change both i and j

        if(mat == null)
            return new int[0];

        int r = 0;
        int c = 0;
        int dir = 1;
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int i = 0;
        while(i < m*n) {
            result[i] = mat[r][c];
            //upward
            if(dir == 1) {
                if(c == n-1) {
                    r++; dir = -1;
                } else if(r == 0) {
                    c++; dir = -1;
                } else {
                    r--;
                    c++;
                }
            } else {
                if(r == m-1) {
                    c++; dir = 1;
                } else if(c == 0) {
                    r++; dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
            i++;
        }

        return result;

    }
}