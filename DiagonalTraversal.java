public class DiagonalTraversal {

    //TC - O(mn)
    // Space - O(1)
    public int[] findDiagonalOrder(int[][] mat) {

        if(mat ==null || mat.length ==0) {
            return new int[]{};
        }

        int m = mat.length;
        int n = mat[0].length;
        int [] ans = new int[m*n];

        int dir =1;
        int i=0;
        int j=0;
        for(int k=0; k<m*n;k++) {
            ans[k] = mat[i][j];
            if(dir ==1) {
                if(j==n-1) {
                    i++;
                    dir= -1;
                } else if(i==0) {
                    j++;
                    dir=-1;
                } else {
                    i--;
                    j++;
                }
            } else {
                if(i==m-1) {
                    j++;
                    dir=1;
                } else if(j==0) {
                    i++;
                    dir=1;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}
