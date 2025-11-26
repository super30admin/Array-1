class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        boolean flag=true;
        int r=0;
        int c=0;
        for(int i=0;i<m*n;i++){
            res[i] = mat[r][c];
            //up
            if(flag){
                if(r==0 && c!=n-1){
                    c++;
                    flag=false;
                }else if(c==n-1){
                    r++;
                    flag=false;
                }else{
                    r--;
                    c++;
                }
            }else{ //down
                if(r==m-1){
                    c++;
                    flag=true;
                }else if(c==0){
                    r++;
                    flag=true;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return res;

    }
}