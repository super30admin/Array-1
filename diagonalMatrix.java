class Solution {
    //Time complexity: O(m*n);
    //Space complexity: O(1)
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] res=new int[m*n];
        int i=0,j=0,dir=1;
        int idx=0;
        while(idx<m*n){
            res[idx]=mat[i][j];
            idx++;
            if(dir==1){
                if(i==0 &&  j!=n-1){
                    j++;
                    dir=-1; 
                }
                else if(j==n-1){
                    i++;
                    dir=-1;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(j==0 && i!=m-1){
                    i++;
                    dir=1;
                }
                else if(i==m-1){
                    j++;
                    dir=1;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}