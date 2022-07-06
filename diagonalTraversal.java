// Time Complexity :O(m*n) where m is no of rows and n is no of columns
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes

class diagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
       if(mat == null || mat.length == 0) return new int[] {};
        int m = mat.length; // no.of rows
        int n = mat[0].length; // no.of columns
        int[] result = new int[m*n];
        int r = 0, c = 0;
        int index = 0;
        int dir = 1;// 1 -> upward dir, -1-> downward dir
        
        while(index < m*n){
           result[index] = mat[r][c];
            index++;
            if(dir == 1){
                if(c == n-1){
                   dir = -1;
                    r++;
                }
                else if(r == 0){
                    dir = -1;
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(r == m-1){
                   dir = 1;
                    c++;
                }
                else if(c == 0 ){
                    dir = 1;
                    r++;
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
