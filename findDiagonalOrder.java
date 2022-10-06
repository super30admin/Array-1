//TC - O(m*n)
//SC - O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;
        int n= mat[0].length;
        int[] res = new int[m*n];
        int dir = 1;
        int r = 0;
        int c = 0;
        int idx=0;
        while(idx<m*n){
            res[idx] = mat[r][c];
            if(dir == 1){
                if(c==n-1){
                    dir = -1;
                    r++;
                }
                else if (r ==0){
                    dir = -1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r==m-1){
                    dir = 1;
                    c++;
                }
                else if(c==0){
                    dir = 1;
                    r++;
                }
                else{
                    r++;
                    c--;
                }
                
            }
            idx++;
        }
        return res;
    }
}