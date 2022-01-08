// Time Complexity O(m*n)
// Space Complexity O(1), no auxilary space used, just the result array modified
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null) return new int[0];
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[m*n];
        int k = 0;
        int dir = 1;
        int i = 0; int j = 0;
        while(k<m*n){
            result[k] = mat[i][j];
            k++;
            if(dir == 1){
                if(j == n-1){
                    i++; dir = -1;
                }else if(i==0){
                    j++; dir = -1;
                }else{
                    i--;j++;
                }
            }else{
                if(i == n-1){
                    j++; dir = 1;
                }else if(j==0){
                    i++; dir = 1;
                }else{
                    j--;i++; 
                }
            }
        }
        return result;
    }
}