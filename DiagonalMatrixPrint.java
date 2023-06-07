class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; int n = mat[0].length;
        int[] result = new int[m*n];
        int idx = 0; int i = 0; int j = 0; boolean up = true;
        while(idx < m*n){
            result[idx] = mat[i][j];
            if(up){
                if(i==0 && j<n-1){
                    j++; up = false;
                } else if(j==n-1){
                    i++; up = false;
                } else{
                    i--;j++;
                }
            }   
            else if(!up){
                if(j==0 && i<m-1){
                    i++; up = true;
                } else if(i==m-1){
                    j++; up = true;
                } else{
                    i++;j--;
                }
            }

            idx++;
            
        }

        return result;    
    }
}