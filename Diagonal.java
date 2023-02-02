// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //null check
        if(mat == null || mat.length == 0) return new int[0];
        int r=0, c=0; //r is row and c is column
        int m = mat.length; //row length
        int n = mat[0].length; //col length
        int [] result = new int[m*n];
        int i = 0;
        int dir = 1;
        while(i<m*n){
            result[i] = mat[r][c];
            //upward
            if(dir==1){
                if(c==n-1){
                     r++;
                    dir = -1;     
                }
                else if(r==0){
                    c++;
                    dir = -1;
                }
                else{ //normal operation of upward
                    r--;
                    c++;
                }
            }
            //downward
            else{
                if(r==m-1){
                    c++;
                    dir = 1;
                }
                else if(c==0){                    
                    r++;
                    dir = 1;
                }
                else{ //normal operation of upward
                    r++;
                    c--;
                }
            }
            i++;

        }
        return result;
    }
}