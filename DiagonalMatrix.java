// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int i=0;
        int j = 0;
        int dir = 1; // up
        int idx = 0;
        while(idx<result.length){
            result[idx] = mat[i][j];
            idx++;

            if(dir==1){
                if(j==n-1){
                    i++; dir=-1; //down
                }
                else if(i==0){
                    j++; dir = -1;
                }
                else {
                    i--; j++;
                }
            }
            else
            {
                if(i== m-1){
                    j++; dir = 1;
                }else if(j==0){
                    i++; dir = 1;
                }
                else{
                    i++; j--;
                }
            }
        }
        return result;        
    }
}
