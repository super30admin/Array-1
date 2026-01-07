//top: flag=true
//bottom: flag=false
//TC: O(m*n)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        int r=0,c=0;
        boolean flag=true;

        int[] ans=new int[m*n];
       ans[0]=mat[0][0];
       int i=1;
        while(i<(m*n)){
            if(flag){
                if(r==0 && !(c==n-1)){
                    c++;
                    flag=false;
                }else if(c==n-1){
                    r++;
                    flag=false;
                }else{
                    r--;
                    c++;
                }
                
            }else{
                 if(c==0 && !(r==m-1)){
                    r++;
                    flag=true;
                }else if(r==m-1){
                    c++;
                    flag=true;
                }else{
                    r++;
                    c--;
                }

            }
            ans[i]=mat[r][c];
            i+=1;
        }

        return ans;
    }
}
