//Time complexity = O(m*n)
//Space complexity = O(1), because no axuiliary space is used. (returning array, i.e., result, is not considered as auxiliary space as the function wants an array to be returned)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: First, divided the solution into two part, UP direction and DOWN direction. Next, handling the edge cases and adding the element into the array

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        //edge case
        if(mat == null || mat.length == 0)
            return new int[0];
        
        //always should move UP first
        int dir = 1;
        
        //calculating the length of rows and cols
        int m = mat.length , n = mat[0].length;
        
        //to keep track of rows and cols, so initialize with zero first
        //to access new index in returning array and keep track of rows * cols = i,
        //i.e., no. of elements in matrix = no. of elements in array
        int row = 0, col = 0, i = 0;
        
        //initializing the result array
        int[] result = new int[m*n];
        
        //iterating from start to end of the matrix
        while( i < m*n){
            
            //updating result with matrix's value
            result[i] = mat[row][col];
            
            //up direction
            if(dir == 1){
                
                if(col == n-1){
                    row++;
                    dir = -1;
                    
                } else if(row == 0){
                    col++;
                    dir = -1;
                    
                } else {
                    row--;
                    col++;
                }
            }
            //down direction
            else {
                if(row == m-1){
                    col++;
                    dir = 1;
                    
                } else if(col == 0){
                    row++;
                    dir = 1;
                    
                } else {
                    col--;
                    row++;
                }
            }
            
            //incrementing the pointer of array after checking the conditions & adding a element
            i++;
        }
        return result;
    }
}
