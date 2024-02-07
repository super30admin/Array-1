public class diagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n= mat[0].length;
        int i=0; int j=0;
        //up condition
        boolean dir = true;
        int res[] = new int[m*n];
        for( int idx=0; idx<m*n; idx++){
            res[idx] = mat[i][j];
            if(dir){
                if( j==n-1){
                    i++; dir=false;
                }
                else if(i==0) {
                    j++; dir=false;
                }
                else {
                    i--; j++;
                }
            }
            else{
                if(i==m-1) {
                    j++; dir=true;
                }
                else if(j==0) {
                    i++; dir=true;//doubt here
                }
                else {
                    j--;
                    i++;
                }
            }
        }
        return res;
    }
}
