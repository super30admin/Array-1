//T.C- O(nxm)
//S.C- O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0){
            return new int[]{};
        }
        int m= mat.length;
        int n= mat[0].length;
        int[] result= new int[m*n];
        int r=0;
        int c=0;
        int ind=0;
        int dir=1;
        while(ind< m*n){
            result[ind]= mat[r][c];
            ind++;
            if(dir==1){
                if(c== n-1){
                    dir=-1;
                    r++;
                }else if(r==0){
                    dir=-1;
                    c++;
                }else{
                    r--;
                    c++;
                }
            }
            else{
                if(r==m-1){
                    dir= 1;
                    c++;
                }else if(c==0){
                    dir= 1;
                    r++;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}