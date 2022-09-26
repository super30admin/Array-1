// Time Complexity : O(M*N) where M = no. of rows and N is number cols
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[]{};

        int m = mat.length;
        int n = mat[0].length;
        int[] out = new int[m*n];
        int r = 0, c = 0, idx = 0;
        int dir = 1; //1 = upward, -1=downward

        while(idx<m*n){
            out[idx] = mat[r][c];
            idx++;
            if(dir == 1){
                if(c == n-1){
                    dir = -1;
                    r++;
                } else if(r==0){
                    dir = -1;
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else {
                if(r==m-1){
                    dir = 1;
                    c++;
                } else if(c==0){
                    dir = 1;
                    r++;
                } else{
                    c--;
                    r++;
                }
            }
        }

        return out;
    }
}