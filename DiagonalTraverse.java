class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int row = 0, col = 0;
        int[] res = new int[m*n];
        boolean dir = true; // UP - T, Down - F
        for(int i = 0;i<m*n;i++) {
            res[i] = mat[row][col];
            if(dir) {
                if(col ==  n-1) {
                    row++;
                    dir = false;
                } else if(row == 0) {
                    col++;
                    dir = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if(row ==  m-1) {
                    col++;
                    dir = true;
                } else if(col == 0) {
                    row++;
                    dir = true;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return res;
    }
}