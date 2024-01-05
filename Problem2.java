//Accepted on LT
// The idea is to check for bounds and keep moving
//Time should be number of elements in matrix O(Mn)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] f = new int[n*m];
        int i=0;
        int j=0;
        boolean b = true;

        
        
        for(int idx = 0;idx<f.length;idx++){
            f[idx] = mat[i][j];
            if(b){
                if(i==0 && j!=n-1){
                    j++;
                    b = false;
                }
                else if(j==n-1){
                    i++;
                    b = false;
                    
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(j==0 && i!=m-1){
                    i++;
                    b = true;
                }
                else if(i==m-1){
                    j++;
                    b = true;
                    
                }
                else{
                    j--;
                    i++;
                }
                
            }
        }
        return f;
    }
}