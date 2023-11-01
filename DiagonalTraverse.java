// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int idx = 0;
        int[] res = new int[m*n];
        boolean dir = true;
        int i=0;
        int j=0;
        while(idx < m*n){
          
            res[idx]=mat[i][j];
            if(dir){
                if(j == n-1){
                    dir = false;
                    i++;
                }
                else if(i==0){
                    dir = false;
                    j++;
                }
               
                else{
                    i--;
                    j++;
                   
                }
            }
            else{
                if(i==m-1){
                    dir = true;
                    j++;
                }
                else if(j==0){
                   dir = true;
                   i++;
                }
                else{
                    i++;
                    j--;
                }
            }
            idx++;
        }
        return res;
    }
}
