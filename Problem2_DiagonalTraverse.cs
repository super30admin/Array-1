// Approach : By case analysis, consider moving up and down traversing through the matrix with edge cases
// Space Complexity : O(1)
// Time Complexity : O(m*n) where m is num of rows and n is num of cols
// https://leetcode.com/problems/diagonal-traverse/
public class Solution {
    private static readonly int Up = 0, Down = 1;
    
    public int[] FindDiagonalOrder(int[][] mat) {        
        int m = mat.Length, n = mat[0].Length;
        int[] ans = new int[m*n];
        
        int count = 0;
        int direction = Up;
        
        int row=0, col=0;
        
        while(count < m*n){
            ans[count] = mat[row][col];
            count++;
            
            if(direction == Up){
                if(col == n-1){
                    direction = Down;
                    row++;
                } else if(row == 0){
                    direction = Down;
                    col++;
                } else {
                    row--;
                    col++;
                }
                
            } else {
                if(row == m-1){
                    direction = Up;
                    col++;
                } else if(col == 0){
                    direction = Up;
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
            
        }
        
        return ans;
    }
}
