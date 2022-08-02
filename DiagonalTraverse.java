class Diagonaltraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[] {};
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r = 0;
        int c = 0;
        int dir = 1;
        int idx = 0;
        while (idx < result.length) {
             result[idx] = mat[r][c];
             idx++;
             if (dir == 1) {
                 if (c == n -1) {
                     r++;
                     dir = -1;
                 } else if (r == 0) {
                     c++;
                     dir = -1;
                 } else {
                     r--;
                     c++;
                 }
             } else {
                 if (r == m-1) {
                     c++; dir = 1;
                 } else if (c == 0) {
                     r++;
                     dir = 1;
                 } else {
                     c--; r++;
                 }
             }
        }
        return result;
    }
}