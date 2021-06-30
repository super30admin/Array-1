// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0){
            return new int[0];
        }
        
        int row = 0;
        int col = 0;
        int dir = 1;
        
        int m = mat.length;
        int n = mat[0].length;
        
        int[] result = new int[m*n];
        
        int i=0;
        while(i < m*n){
            result[i] = mat[row][col];
            if(dir == 1){
                if(col == n-1){
                    row++;
                    dir = -1;
                }
                else if(row == 0){
                    col++;
                    dir = -1;
                }
                else{
                    row--;
                    col++;
                }
            }
            
            else{
                if(row == m-1){
                    col++;
                    dir = 1;
                }
                else if(col == 0){
                    row++;
                    dir = 1;
                }
                else{
                    row++;
                    col--;
                }
            }
            i++;
        }
        return result;
    }
}