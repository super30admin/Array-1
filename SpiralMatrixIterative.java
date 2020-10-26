package Oct26;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrixIterative {
    public List<Integer> spiralOrder(int[][] matrix) {
      
    // Time Complexity: O(mn) where m is no.of rows and n is no.of columns in given matrix.
	// Because we are traversing the matrix once completely.

	// Space Complexity: O(1)
    // Because we are using only one list of length mn but this list will be returned by the function, hence it doesn't contribute towards the space complexity.
	        
	// Did this code successfully run on Leetcode : Yes

	// Any problem you faced while coding this : No

	/* Approach: 
	    
        Iterative solution given. 

*/   
        // list to store the result of the function
        List<Integer> result = new ArrayList<>();
        
        // edge conditions
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        /* Initialiazing 4 pointers to indicate top, bottom, left and right indexes in the given matrix
                    left           right
                    |               |
                    |               |                 
                    V               V
                    
        top  -----> 1       2       3
                    4       5       6
        bottom----> 7       8       9
            
            
   */         
        int top = 0, left = 0;
        int bottom = rows-1, right = cols-1;
        
        // if conditions included inside the while loop for all the FOR loops because after for loop execution, we are resetting left, right, bottom or top pointers. This can cause breach of the condition in while loop. So, to check if no breach has happened, if conditions used.
        
        while (left <= right && top <= bottom) {
            
            // move rightward
            if (left <= right && top <= bottom) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }
            
            // move downward
            if (left <= right && top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }
            
            // move leftward
            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                   result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // move upward
            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        
        return result;
    }
}