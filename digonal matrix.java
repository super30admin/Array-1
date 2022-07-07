// Time Complexity : o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no




// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int r=0;
        int c=0;
        int k=0;
        int d=1;
        int[] result= new int[m*n];
        while(k<m*n){
            result[k]=mat[r][c];
            k++;
            if(d==1){
                if(c==n-1){
                    r++;
                    d=-1;
                }else if(r==0){
                    c++;
                    d=-1;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(r==m-1){
                    c++;
                    d=1;
                }else if(c==0){
                    r++;
                    d=1;
                    
                }else{
                    r++;
                    c--;
                }
            }
              
        }
        return result;
    }
}