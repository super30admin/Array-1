//time-O(m*n) m-mat.length, n-mat[0].length
//space-O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) return new int[]{};

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m*n];
        int dir = 1;
        int r=0, c=0, index=0;

        while(r<m && c<n && index<m*n){
            result[index] = mat[r][c];
            index++;
            if(dir==1){
                if(c==n-1){
                    r++;
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
            }
            else{
                if(r==m-1){
                    c++;
                    dir=1;
                }
                else if(c==0){
                    r++;
                    dir=1;
                }
                else{
                    r++;
                    c--;
                }
            }
        }


        return result;
    }
}