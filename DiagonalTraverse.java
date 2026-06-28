public class DiagonalTraverse {
    public int[] findDiagOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] ans = new int[row*col];
        int r = 0;
        int c = 0;
        boolean flag = true;
        for (int i=0; i<row*col; i++){
            ans[i] = mat[r][c];
            if (flag) {
                if (c==col-1) {
                    r++; flag=false; 
                } else if (r==0) {
                    flag = false;
                    c++;
                } else {
                    r--; c++;
                }
            } else {
                if (r==row-1) {
                    c++; flag=true;
                } else if (c==0) {
                    r++; flag=true;
                } else {
                    c--; r++;
                }
            }
        }   
        return ans;
    }
    
}
