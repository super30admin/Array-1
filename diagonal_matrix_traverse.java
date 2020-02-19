// Time Complexity : O(m*n) 2D matrix elements are being traversed
// Space Complexity : O(1): if result array is not considered OR
				//S: O(m*n)): if result array considered 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach: Same as class


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
      
        //base check
        if(matrix == null || matrix.length == 0) return new int[0];
        
        //initializing pointers and flag for direction change
        int row = 0, col = 0, direction = 1;
        
        //finding matrix row and col lengths resppectively
        int m = matrix.length, n = matrix[0].length;
        
        //initializing array to store result
        int[] result = new int[m *n];
        
        //value to increment index of result array
        int i=0;
        
        //loop to satisfy the conditions of 2D matrix traverse
        while(i < m*n){
            
            result[i] = matrix[row][col];
            
            if(direction == 1){
                if(col == n-1){
                    row++;
                    direction = -1;
                }else if(row == 0){
                    col++;
                    direction = -1;                
                }else{
                    row--;
                    col++;
                }  
            }else{
                if(row == m-1){
                    col++;
                    direction = 1;
                }else if(col == 0){
                    row++;
                    direction = 1;
                }else{
                    row++;
                    col--;
                }
            }
            i++;
            
        }
        
        return result;
    }
}