/*
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

] 

Output: [1,2,3,6,9,8,7,4,5] Example 2:


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
 * Did this code successfully run on leetcode: No leetcode link provided
 * 
 * Any problem you faced while coding this: Not really
 * 
 */


package com.s30.edu.array1;

import java.util.Arrays;

public class SpiralOrder {
	
	public int[] spiralOrder(int[][] matrix) {
		int t = 0; // to mark the topmost row of untraversed matrix
		int b = matrix.length-1; // to mark the bottom row of untraversed matrix
		int l = 0; // to mark the leftmost column of untraversed matrix
		int r = matrix[0].length-1; // to mark the rightmost column of untraversed matrix
		int dir = 0; // to track the direction of traversing
		
		int pointer = 0; // pointer to keep track of indexes in result array
		
		// Create a result array to store matrix elements in spiral order
		int[] result = new int[matrix.length * matrix[0].length];
		
		/*
         * dir = 0 // left -> right
         * dir = 1 // top -> bottom
         * dir = 2 // right -> left
         * dir = 3 // bottom -> up
         */
        while(t <= b && l <= r){
            if(dir == 0){ // left -> right traversing
                for(int i=l; i <= r; i++){ // 'i' pointer to traverse the columns (row will remain same)
                    result[pointer] = matrix[t][i]; // Add the elements in resultant array
                    pointer++;
                }
                t++; //move to next row since we are done traversing first row
            }
            else if(dir == 1){ // top -> bottom traversing
                for(int i=t; i <= b; i++){ // 'i' pointer to traverse the remaining rows (column will remain same)
                    result[pointer] = matrix[i][r];
                    pointer++;
                }
                r--; //move to the left column since we are done traversing the rightmost one
            }
            else if(dir == 2){ // right -> left
                for(int i=r; i >= l; i--){ // 'i' pointer to traverse the remaining columns (row will be same) 
                    result[pointer] = matrix[b][i];
                    pointer++;
                }
                b--; // move to the previous row since we are done traversing the last row
            }
            else{
                for(int i=b; i >= t; i--){	 // bottom -> up
                    result[pointer] = matrix[i][l];
                    pointer++;
                }
                l++; // move to the 2nd column since we are done traversing first one
            }
            dir = (dir+1)%4; // Changes the direction of traversing the matrix
        }
		
		return result;
		
	}
	
	// main method
	public static void main(String[] args) {
		SpiralOrder so = new SpiralOrder();
		
		int[][] input = {
		         {1,2,3,4},
		         {5,6,7,8},
		         {9,10,11,12}
		};
		
		/*int[][] input = {
		         {1,2,3},
		         {4,5,6},
		         {7,8,9}
		};*/
		
		int[] output = so.spiralOrder(input);
		System.out.println(Arrays.toString(output));
	}

}
