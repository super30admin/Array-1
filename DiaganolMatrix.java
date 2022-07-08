//Time Complexity: O(m*n)
//Space Complexity: O(m*n)
//Does this code run on Leetcode: Yes
//Any problems faced during coding: No.

// The trick here is that we need to understand the direction change and row and col increments decrements. 



class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null)
            return new int[]{};
        
        int m = mat.length;
        int n = mat[0].length;
        
        int ans[] = new int[m*n];
        
        int row = 0;
        int col = 0;
        int i = 0;
        int dir = 1; 
        
        // For moving in the directions. 
        
        while(i < m*n)
        {
            
            ans[i] = mat[row][col];
            i++;
            
            if(dir == 1){
            if(col == n-1){
                dir = -1;
                row++;
            }
            else if(row == 0){
                dir = -1;
                col++;
                
            }
            else{
                row--;
                col++;
            }
        }
            
        else{
            if(row == m-1){
                dir = 1;
                col++;
            }
            else if(col == 0){
                dir = 1;
                row++;
            }
            else{
                row++;
                col--;
            }
        } 
        }
        return ans;
        }
    }
