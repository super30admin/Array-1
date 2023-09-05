//TC: O(M*N) SC: O(1)
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] out = new int[m*n];
        int dir = 1;
        int idx = 0;
        int i = 0;
        int j = 0;
    
        while(idx < out.length) {
            out[idx] = mat[i][j];
            idx++;
            if(dir == 1) {
                // up
                if( j == n-1) {
                    i++;
                    dir = -1;
                } else if(i == 0) {
                    j++;
                    dir = -1;
                } else {
                    i--; 
                    j++;
                }
            } else {
                //down
                if( i == m-1) {
                    j++;
                    dir = 1;
                } else if(j == 0) {
                    i++;
                    dir = 1;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return out;
    }
}
