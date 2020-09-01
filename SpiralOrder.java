/*
 * #54. Spiral Matrix
 * 
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output: [1,2,3,6,9,8,7,4,5]

Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]

Output: [1,2,3,4,8,12,11,10,9,5,6,7]

 */


/*
 * Time Complexity: O (NxM) -> To traverse the rows and columns of a matrix
 * 
 * Space Complexity: O (1) -> returning the same array as output which we created so no extra space
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: Not really
 * 
 */


package com.s30.edu.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrder {
	
public List<Integer> spiralOrder(int[][] matrix) {
        
        // Base condition
        // Check if matrix is null or rows/columns size is zero
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<>();
        }
        
		int t = 0; // to mark the topmost row of untraversed matrix
		int b = matrix.length-1; // to mark the bottom row of untraversed matrix
		int l = 0; // to mark the leftmost column of untraversed matrix
		int r = matrix[0].length-1; // to mark the rightmost column of untraversed matrix
		int dir = 0; // to track the direction of traversing
		
		// Create a resultant ArrayList to store matrix elements in spiral order
		List<Integer> output = new ArrayList<>();
		
		/*
         * dir = 0 // left -> right
         * dir = 1 // top -> bottom
         * dir = 2 // right -> left
         * dir = 3 // bottom -> up
         */
        while(t <= b && l <= r){
            if(dir == 0){ // left -> right traversing
                for(int i=l; i <= r; i++){ // 'i' pointer to traverse the columns (row will remain same)
                    output.add(matrix[t][i]); // Add the elements in resultant ArrayList
                }
                t++; //move to next row since we are done traversing first row
            }
            else if(dir == 1){ // top -> bottom traversing
                for(int i=t; i <= b; i++){ // 'i' pointer to traverse the remaining rows (column will remain same)
                    output.add(matrix[i][r]);
                }
                r--; //move to the left column since we are done traversing the rightmost one
            }
            else if(dir == 2){ // right -> left
                for(int i=r; i >= l; i--){ // 'i' pointer to traverse the remaining columns (row will be same) 
                	output.add(matrix[b][i]);
                }
                b--; // move to the previous row since we are done traversing the last row
            }
            else{
                for(int i=b; i >= t; i--){	 // bottom -> up
                	output.add(matrix[i][l]);
                }
                l++; // move to the 2nd column since we are done traversing first one
            }
            dir = (dir+1)%4; // Changes the direction of traversing the matrix
        }
		
		return output; // Return the output with elements in spiral order
		
	}

}
