// tc = o(m*n) m = row, n = col
// sc = o(1)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i = 0;
        int j = 0;
        int[] result = new int[m*n];
        boolean up = true;
        for(int idx = 0;idx < result.length;idx++){
            result[idx] = mat[i][j];
            if(up){
                if(j==n-1){
                    i++;
                    up=false;
                }
                else if(i == 0){
                    j++;
                    up=false;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==m-1){
                    j++;
                    up = true;
                }
                else if(j==0){
                    i++;
                    up = true;
                }
                else{
                    j--;
                    i++;
                }
            }


        }
        return result;
    }
}