package Oct26;


class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        
    // Time Complexity: O(mn) where m is no.of rows and n is no.of columns in given matrix.
	// Because we are traversing the matrix once completely.

	// Space Complexity: O(1).
    // Because we are using only one result array of length mn but this array will be returned by the function, hence it doesn't contribute towards the space complexity.
	        
	// Did this code successfully run on Leetcode : Yes

	// Any problem you faced while coding this : No

	/* Approach: 
	
   1)  Taking direction variable to track upward and downward movement in the matrix.
    
   2)  Checking for underflow/overflow of current row and columns and resetting direction, rows and columns accordingly.
   
NOTE: 
-------
  a)  UPWARD MOVEMENT : first check for columns out of range, then check for rows out of range
  b)  DOWNWARD MOVEMENT : first check for rows out of range, then check for columns out of range

In both cases, after these checks, update pointers for intermediate elements of given matrix (when neither columns nor rows are out of bounds)
*/
        
        // edge case
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int dir = 1; // direction 1 => going upward, direction = -1 => going downward
    
        int[] result = new int[rows*cols];
        
        // i and j indexes to traverse the given matrix
        // k index to traverse the result array
        int i = 0, j = 0, k = 0;
        
        while (k < rows*cols) {
            
            result[k] = matrix[i][j];
            k++;  
            
            // upward movement
            if (dir == 1) {  
                // Note:
                // first check for columns out of range
                // then check for rows out of range
                // last update pointers for intermediate elements of given matrix (when neither columns nor rows are out of bounds)
                // IF ORDER FOR COLUMNS AND ROWS IS REVERSED, ARRAY OUT OF BOUNDS ERROR WILL BE FACED.
                if (j == cols-1) {
                    i++;
                    dir = -1;
                } else if (i == 0) {
                    j++;
                    dir = -1;
                } else {
                    i--;
                    j++; 
                }
            } 
            
            // downward movement
            else {
                // Note:
                // first check for rows out of range
                // then check for columns out of range
                // last update pointers for intermediate elements of given matrix (when neither columns nor rows are out of bounds)
                // IF ORDER FOR ROWS AND COLUMNS IS REVERSED, ARRAY OUT OF BOUNDS ERROR WILL BE FACED.
                if (i == rows-1) {
                    j++;
                    dir = 1;
                } else if (j == 0) {
                    i++;
                    dir = 1;
                } else {
                    i++;
                    j--; 
                }
            }
        }
        
        return result;
        
    }
}