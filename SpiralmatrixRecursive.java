package Oct26;

import java.util.ArrayList;
import java.util.List;

class SpiralmatrixRecursive {
    public List<Integer> spiralOrder(int[][] matrix) {
      
    // Time Complexity: O(mn) where m is no.of rows and n is no.of columns in given matrix.
	// Because we are traversing the matrix once completely.

	// Space Complexity: O(1)
    // Because we are using only one list of length mn but this list will be returned by the function, hence it doesn't contribute towards the space complexity.
    // Not sure if recursive call stack space will be counted in space complexity.
	        
	// Did this code successfully run on Leetcode : Yes

	// Any problem you faced while coding this : No

	/* Approach: 
	    
        Recursive solution given. 
         /* Initialiazing 4 pointers to indicate top, bottom, left and right indexes in the given matrix
                    left           right
                    |               |
                    |               |                 
                    V               V
                    
        top  -----> 1       2       3
                    4       5       6
        bottom----> 7       8       9
            
            
   */         
 
        // list to store the result of the function
        List<Integer> result = new ArrayList<>();
        
        // edge conditions
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        helper(matrix,0,matrix[0].length-1,0,matrix.length-1,result);
        return result;
        
    }
    public void helper(int[][]matrix, int left, int right, int top, int bottom, List<Integer> result) {
        
        // base condition for recursion
        if (left > right || top > bottom) {
            return;
        } 
     
// if conditions included for all the FOR loops because after for loop execution, we are resetting left, right, bottom or top pointers. This can cause recursive function base condition to come true while FOR loops are getting executed and the 4 pointers getting reset. So, to check if base condition is not true, if conditions used.
        
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
        
       helper(matrix, left,right, top, bottom, result);
        
    }
}