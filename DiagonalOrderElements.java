/*
 * #498. Diagonal Traverse
 * 
 Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

 

Example:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output:  [1,2,4,7,5,3,6,8,9]

Note:

The total number of elements of the given matrix will not exceed 10,000.

 */


/*
 * Time Complexity: O (NxM) -> To traverse the result array of size NxM
 * 
 * Space Complexity: O (1) -> returning the same array as output which we created so no extra space
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: Not really
 * 
 */


package com.s30.edu.array1;

public class DiagonalOrderElements {
public int[] findDiagonalOrder(int[][] matrix) {
        
		// Base condition
		// If matrix is null or rows/colums are zero, return empty array
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        
        int x = 0; // matrix row index
		int y = 0; // matrix column index
		int numOfRows = matrix.length; // number of rows
		int numOfColumns = matrix[0].length; // number of columns
		
		// Create a result array with length = total number of elements in matrix
		int[] res = new int[matrix.length * matrix[0].length];
		
		// Traverse through the result array and store the matrix elements in diagonal order
		for(int i = 0; i < numOfRows * numOfColumns; i++) {
			res[i] = matrix[x][y]; // copy the element in result array
			
			// IF condition is satisfied
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
			//Else
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
		return res; // return result array with matrix elements in diagonal order
    }
	
}
