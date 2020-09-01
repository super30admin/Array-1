/*
 * Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]

 */


/*
 * Time Complexity: O (NxM) -> To traverse the result array of size NxM
 * 
 * Space Complexity: O (1) -> returning the same array as output which we created so no extra space
 * 
 * Did this code successfully run on leetcode: No leetcode link given
 * 
 * Any problem you faced while coding this: Not really
 * 
 */


package com.s30.edu.array1;

import java.util.Arrays;

public class DiagonalOrderElements {
	public int[] findDiagonalOrder(int[][] matrix) {
		// Initialize row and column index to 0
		int x = 0;
		int y = 0;
		int numOfRows = matrix.length; // get number of rows
		int numOfColumns = matrix[0].length; // get number of columns
		
		// Create a result array to store the diagonal order of matrix elements
		// length of array will be rows x columns of given matrix
		int[] res = new int[matrix.length * matrix[0].length];
		
		// Traverse through the result array to fill it up
		for(int i = 0; i < numOfRows * numOfColumns; i++) {
			res[i] = matrix[x][y]; // copy the first element from matrix in result array
			
			
			// Then, based on the conditions, traverse downwards or upwards in the given matrix diagonally
			if((x + y) % 2 == 0) {
				//If last column, then go to next row
				if(y == numOfColumns - 1) {
					x++;
				}
				//If first row and not last column, then go to next column
				else if(x == 0) {
					y++;
				//Go up
				}else {
					x--;
					y++;
				}
			}
			else {
				//If last row, go to next column
				if(x == numOfRows - 1) {
					y++;
				}
				//If first column and not last row, then go to next row
				else if(y == 0) {
					x++;
				}
				//Go down
				else {
					x++;
					y--;
				}
				
			}
			
		}
		
		// return the result array with matrix elements in diagonal order (upwards and downwards alternately)
		return res;
		
	}
	
	// main method
	public static void main(String[] args) {
		DiagonalOrderElements dt = new DiagonalOrderElements();
		int[][] input = {
		         {1,2,3},
		         {4,5,6},
		         {7,8,9},
		};
		
		int[] output = dt.findDiagonalOrder(input);
		System.out.println(Arrays.toString(output));
	}
	
}
