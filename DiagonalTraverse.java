public class DiagonalTraverse {
    // TC is O(m*n)
    // SC is O(m*n)
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        boolean up = true;
        int idx = 0,i=0,j=0;
        while(idx < result.length){
            result[idx] = mat[i][j];
            idx++;
            if(up){
                if(i == 0 && j!=n-1){
                    j++;
                    up = false;
                }else if(j==n-1){
                    i++;
                    up = false;
                }else{
                    i--;
                    j++;
                }
            }else {
                if(j==0 && i != m-1){
                    i++;
                    up = true;
                }else if(i==m-1){
                    j++;
                    up = true;
                }else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}
