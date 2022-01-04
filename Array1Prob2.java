

// Time Complexity : O(m*n) where m is rows, n is columns
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes


// approach : we will traverse the matrix in up and down direction. While traversing up we will decrease row and increase column and while traversing down, its vice versa. And we will handle edge cases in both directions


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if(mat == null)
            return null;
        
        int m = mat.length;
        int n = mat[0].length;
        boolean upwards = true;
        
        int[] diag = new int[m*n];
        int r=0,c=0;
        
        for(int k=0;k< (m*n); k++){
            diag[k] = mat[r][c];
            if(upwards){
                if(c == n-1){
                    r++;
                    upwards = !upwards;
                }else if(r ==0){
                    c++;
                    upwards = !upwards;
                }else{
                    r--;c++;
                }
            }else{
                if(r == m-1){
                    c++;
                    upwards = !upwards;
                }else if( c == 0){
                    r++;
                    upwards = !upwards;
                }else{
                    r++;c--;
                }
            }
        }
        return diag;
    }
}