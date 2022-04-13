class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0){
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        int r = 0;
        int c = 0;
        int[] result = new int[m * n];
        int loc = 0;
        int dir = 1;
        while(r < m && c < n){
            result[loc] = mat[r][c];
            if(dir == 1){
                if(c==n-1){
                    r++; dir = -1;
                }else if(r==0){
                    c++; dir = -1;
                }else{
                    r--; c++;
                }
            }else{  //dir==-1
                if(r==m-1){
                    c++; dir = 1;
                }else if(c==0){
                    r++; dir = 1;
                }else{
                    r++; c--;
                }
            }
            loc++;
        }
        return result;
    }
}

// Time Complexity : O(m * n)
// Space Complexiy : O(m * n)