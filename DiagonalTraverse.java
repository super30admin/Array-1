class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length ==0) return new int [] {};
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[m*n];
        int r=0;
        int c=0;
        boolean dir = true;
        int i=0;
      

        while(i < m*n){
             result[i] = mat[r][c];
                i++;
            if(dir){
                if(c == n-1){
                    r++;
                    dir = false;
                }
                else if(r==0){
                    c++;
                    dir = false;
                }
                else {
                    r--;
                    c++;
                }
                
            }

            else{
                if(r==m-1){
                    c++;
                    dir = true;
                }
                 else if(c == 0){
                   r++;
                   dir = true;
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



/**
Tc : O(m*n) Traversing whole matrix
SC : O(1) : returning created array. so no auxilary space


Description : Taking this problem into 2 parts. one part is going in upward direction and another part is going in downward direction. Downward direction is Just exactly opposite to the upward direction




 */