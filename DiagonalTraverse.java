class Solution {
    // Time Complexity : O(mn), where m is the no of rows and n is the no of cols
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int i = 0;
        int dir = 1;
        int r = 0;
        int c = 0;
        int[] result = new int[m*n];
        while(i < m*n) {
            if(dir == 1){
                result[i] = mat[r][c];
                if(c == n-1) {
                    r++;
                    dir = -1;
                } else if(r == 0) {
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }
            } else {
                result[i] = mat[r][c];
                if(r == m-1) {
                    c++;
                    dir = 1;
                } else if(c == 0) {
                    r++;
                    dir = 1;
                } else {
                    c--;
                    r++;
                }
            }
            i++;
        }
        return result;
    }
}