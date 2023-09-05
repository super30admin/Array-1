// Time Complexity: O(mn)
// Space Complexity: O(1)


class Solution2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int idx = 0;
        int r = 0;
        int c = 0;
        boolean dirs = true;
        while( idx < m*n) {
            result[idx] = mat[r][c];
            idx++;
            if( dirs ) {
                if( r == 0 && c != n-1) {
                    dirs = false;
                    c++;
                } else if( c == n-1) {
                    r++;
                    dirs = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if( c == 0 && r != m-1) {
                    dirs = true;
                    r++;
                } else if( r == m-1) {
                    dirs = true;
                    c++;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
