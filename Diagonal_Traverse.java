// Time Complexity : O(m*n), as each element of the matrix is processed once.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/* For traversing we use direction(1 = up and 0 = down), 
 * If direction is up, we need to change the direction when we can't traverse up further, we then decrement the rows and increment the columns 
 * if direction is down, we need to change the direction when we can't traverse down further, we then increment the rows and decrement the columns
 * we traverse the matrix and keep updating the result array*/

import java.util.Arrays;

public class Diagonal_Traverse {
	public static int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new int[0];
        
        //size of the matrix
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row =0, column =0;
        
        int direction =1;	// direction(1= up, 0= down) to keep track of where we are moving the current diagonal
        
        int[] result = new int[m*n];
        int i=0;
        
        // iterate over all elements in matrix
        while(i < m*n){
            result[i] = matrix[row][column];
            
            if(direction == 1){		// if traversing upward direction
                if(column == n-1){
                    row++;
                    direction = -1;
                }
                else if(row == 0){
                    column++;
                    direction= -1;
                }
                else{
                    row--;
                    column++;
                }
            }
            else{		// down
                if(row == m-1){
                    column++;
                    direction = 1;
                }
                else if(column == 0){
                    row++;
                    direction = 1;
                }
                else{
                    column--;
                    row++;
                }
            } 
            i++;
        }
        return result;
    }
	public static void main(String[] args) {
		int[][] matrix = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
		        { 7, 8, 9 }
		};
		System.out.print("Output " + Arrays.toString(findDiagonalOrder(matrix)));
	}

}
