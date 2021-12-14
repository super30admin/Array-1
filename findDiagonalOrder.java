// Time Complexity : O(n * m) ... n=rows and m=columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
While going up do row-- and col++.
When we reach end we move down using these condns
row==0 and col<m ... do col++ else if col=m do row++;
Similarly we move for
row == last row do col++ else if col==0 do row++ and col--.
Continue till index< product of rows and columns.
}*/
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