// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length,i = 0, j = 0;
        int[] res = new int[m*n];
        boolean dir = true;
        for(int k = 0; k < m*n; k++){
            res[k] = mat[i][j];
            if(dir){
                if(j == n-1){
                    i++;
                    dir = false;}
                else if(i == 0){
                    j++;
                    dir = false;}
                else{
                    i--;
                    j++;
                }
            
            }
            else{
               if(i == m-1){
                    j++;
                    dir = true;}
                else if(j == 0){
                    i++;
                    dir = true;}
                else{
                    j--;
                    i++;
                }
                
            }
        }
        return res;
    }
}