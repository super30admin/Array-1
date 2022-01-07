//Time complexity: O(mn)
//Space complexity:O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null ||mat.length==0)
            return null;
        int m=mat.length;
        int n=mat[0].length;
        int r=0,c=0,index=0;
        int result []=new int[m*n];
        int dir=1;
        while(index<m*n){
            result[index++]=mat[r][c];

       
        //While going up
        if(dir==1){
            if(c==n-1){
                dir=-1;
                r++;
            }
            else if (r == 0) {
                    dir = -1;
                    c++;
                } else {
                    r--;
                    c++;
                }
        }
        //While going down
        else{
            if(r==m-1){
                dir=1;
                c++;
            }else if(c==0){
                dir=1;
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
