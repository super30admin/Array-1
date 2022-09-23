class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // T.C : O(m*n)
        // S.C: O(1)
        if (mat == null || mat.length == 0) 
            return new int[]{};
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        
        int r = 0, c = 0;
        int idx = 0;
        int dir = 1; // dir = 1 indicates upward direction, -1 indicates downward dir
        
        while (idx < m*n) {
            res[idx] = mat[r][c];
            idx++;
            if(dir == 1) {
                if (c == n-1){
                    dir = -1;
                    r++;
                }
                else if (r == 0) {
                    dir = -1;
                    c++;
                }
                else {
                    r--;
                    c++;
                }
            }
            else if(dir == -1) {
                if (r == m-1) {
                    dir = 1;
                    c++;
                }
                else if (c == 0) {
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