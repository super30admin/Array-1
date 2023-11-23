// Time Complexity: O(m * n)
// Space Complexity: O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans[] = new int[m * n];

        int r = 0;
        int c = 0;

        boolean up=true;
        for(int i=0; i< m*n; i++){
            ans[i] = mat[r][c];

            if(up){
                if(r == 0 && c != n-1){
                    c++;
                    up = false;
                }else if( c == n - 1){
                    r++;
                    up = false;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(c == 0  && r != m -1){
                    r++;
                    up = true;
                }else if(r == m-1){
                    c++;
                    up = true;
                }else{
                    c--;
                    r++;
                }
            }
        }
        return ans;
    }
}