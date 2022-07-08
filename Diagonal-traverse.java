// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0){
            return new int[]{};
        }
        
        int m = mat.length;
        int n = mat[0].length;
        int dir = 1;
        int[] result = new int[m * n];
        int row = 0;
        int column = 0;
        int index = 0;
        
        while(index < m * n){
            result[index] = mat[row][column];
            index++;
            
            // Going upward
            if(dir == 1){
                if(column == n - 1){
                    dir = -1;
                    row++;
                }
                else if(row == 0){
                    dir = -1;
                    column++;
                }
                else{
                    row--;
                    column++;
                }    
                
            }
            // Going downward
            else{
                if(row == m - 1){
                    dir = 1;
                    column++;
                }
                else if(column == 0){
                    dir = 1;
                    row++;
                }
                else{
                    row++;
                    column--;
                }    
                
            }
        }
        
        return result;
    }
}