//Space complexity: o(1)
//Time complexity: o(m*n)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i=0,j=0;
        int[] res = new int[m*n];
        boolean dir = true;
        for(int idx = 0; idx < m*n ; idx ++){
            res[idx] = mat[i][j];
            if(dir) {
                if(i==0 && j!= n-1){
                    j++;
                    dir=false;
                }else if(j==n-1){
                    i++;
                    dir=false;
                }else {
                    i--;
                    j++;
                }
            } else {
                if(j==0 && i!= m-1){
                    i++;
                    dir=true;
                }else if(i==m-1){
                    j++;
                    dir=true;
                }else {
                    i++;
                    j--;
                }
            }
            
        }
        return res;
    }
}
