// Time Complexity : O(N) we are counting all the n things inside the matrix
// Space Complexity : O(N) adding all N items in array
// Did this code successfully run on Leetcode : yes, understood from class but has to look at code
// Three line explanation of solution in plain english
// we move along the matrix based on the direction (diagnal up or down) given certain boundary conditions
 
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[0];
        int r = 0; 
        int c = 0;
        int dir = 1;
        int m = mat.length;//rows
        int n = mat[0].length;//columns
        int [] result = new int[m*n];
        int i = 0;
        while(i < m*n){
            result[i] = mat[r][c];
            if(dir == 1){
                
                if(c == n - 1){
                    r++;
                    dir = -1;
                }else if(r == 0){
                    c++;
                    dir = -1;
                }else{
                    r--;
                    c++;
                }
                
            }else{
                
                if(r == m - 1){
                    c++;
                    dir = 1;
                }else if(c == 0){
                    r++;
                    dir = 1;
                }else{
                    c--;
                    r++;
                }
                
            }
            
            i++;
            //System.out.println(i);
            
        }  
        return result;
    }
}