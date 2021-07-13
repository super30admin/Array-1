// Time Complexity :O(M*N) Where M is length of row and N is length of column
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length,i=0, r=0,c=0;
        int[] output=new int[m*n];
        while(i<m*n){
            output[i++]=matrix[r][c];
            if(dir==1){
                if(c==n-1){
                    r--;
                    dir=-1;
                }
                else if(r==0){
                    c++;
                    dir=-1;
                }
                else{
                    r--;
                    c++;
                }
            }else{
                if(r==m-1){
                    c--;
                    dir=1;
                }
                else if(c==0){
                    r++;
                    dir=1;
                }
                else{
                    c--;
                    r++;
                }
            }

        }
        return output;
    }
}