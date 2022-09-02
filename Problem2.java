class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[(m*n)];
        int r = 0;
        int c = 0;
        boolean dir = true; // true for up and false for down
        //null check
        if(mat == null || mat.length == 0) return result;

        int cnt = 0;

        while(cnt < m*n){
            // going up
            if(dir){
                if(c==n-1){
                    result[cnt++] = mat[r][c];
                    //cnt++;
                    r++; dir = false;
                }
                else if (r==0){
                    result[cnt++] = mat[r][c];
                    //cnt++;
                    c++; dir = false;
                }
                else{
                    result[cnt++] = mat[r][c];
                    // cnt++;
                    r--; c++;
                }
            }

            // going down
            else{
                if(r==m-1){
                    result[cnt++] = mat[r][c];
                    //cnt++;
                    c++; dir = true;
                }
                else if (c==0){
                    result[cnt++] = mat[r][c];
                    //cnt++;
                    r++; dir = true;
                }
                else{
                    result[cnt++] = mat[r][c];
                    //cnt++;
                    r++; c--;
                }
            }
        }
        return result;
    }
}