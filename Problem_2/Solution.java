// Time Complexity : O(n * m) where n = rows and m = columns 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * We are supposed to travel in up or down.
 * When we are going up we take current element and we do row-- and col++. Whenever we reach condition when we need to change to down we change
 * This change will required when 1. row == 0 and col < m, here we do col++  and 2. col = m, here we do row++. We change direction in both cases
 * Similarly, while traveling in down direction,we take current element and then we do row++ and col--. 
 * When we reach 1. row == last row, we do col++ 2. when col == 0, we do row++. We change direction in both cases  
 * we continue this process till index < product of rows and columns
*/
// Your code here along with comments explaining your approach





class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] ans = new int[mat.length * mat[0].length];
        int index = 0;
        
        int dir = 1;
        int row = 0;
        int col = 0;
        
        int row_limit = mat.length;
        int col_limit = mat[0].length;
        
        while(index < ans.length){
            
            
            while(dir == 1 && row < row_limit && col < col_limit){
                ans[index] = mat[row][col];
                index++;
                if(row == 0 && col < col_limit-1){
                    col++;
                    dir = -1;
                }else if(col == col_limit-1){
                    row++;
                    dir = -1;
                }else{
                row--;
                col++;    
                }
            }
            
            while(dir == -1 && row < row_limit && col < col_limit){
                ans[index] = mat[row][col];
                index++;
                if(row == row_limit-1){
                    col++;
                    dir = 1;
                }else if(col == 0){
                    row++;
                    dir = 1;
                }else{
                    row++;
                    col--;
                }
            }
        } 
        
        return ans;
    }
}