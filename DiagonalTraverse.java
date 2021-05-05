// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(m * n) since we are iterating through the entire matrix in a diagonal way
//Space Complexity: O(1) since we are not taking any extra space except result array

public int[] findDiagonalOrder(int[][] mat) 
{
        
        if(mat == null || mat.length == 0) return new int[0];    
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int row = 0; int col = 0; 
        int i = 0;
        int dir = 1; 
        while(i < m*n){
            res[i] = mat[row][col];
            
            //Moving Upward direction
            if(dir == 1){
                if(col == n-1){ // right most element
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
            // Moving Downward direction
            else{
                if(row == m-1){ //Left last element
                    col++;
                    dir = 1;
                }
                else if(col == 0){
                    row++;
                    dir = 1;
                 }else{
                    row++;
                    col--;
                }
            }            
            i++;
        }
       
        return res;
 }