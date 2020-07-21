// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/* For traversing we use direction, 
 * First we traverse topmost row of the untraversed array from left to right , we need to change the direction when we can't traverse right further, we then increment the top and change direction to 1; 
 * similarly we do with other directions;*/

import java.util.*;

public class Spiral_Matrix {
	public static List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        int m = matrix.length, n= matrix[0].length; // size of matrix (rows, col)
        int top = 0;    	// index for first row
        int bottom = m-1;   //  index for last row
        int left = 0;    	// index for first col
        int right = n-1;    // index for last col
        int direction = 0;  // direction - 0 = right direction
                            // direction - 1 = top to bottom direction
                            // direction - 2 = right to left 
                            // direction - 3 = bottom to top
        
        while(top <= bottom && left <= right){
            if(direction == 0){     // traversing topmost row of the untraversed array from left to right 
                for(int i=left; i<=right; i++){
                    list.add(matrix[top][i]);   
                }
                top++;  //once done with topmost row, increment top
                direction = 1;  // change the direction to 1, so that can traverse from top to bottom
            }
            else if(direction == 1){    // traversing rightmost col of the untraversed array from top to bottom
                for(int i=top; i<=bottom; i++){
                    list.add(matrix[i][right]);
                }
                right--;
                direction = 2;   // change the direction to 2, so that can traverse from right to left
            }
            else if(direction == 2){    // traversing bottom most row of the untraversed array from right to left
                for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
                }
                bottom--;
                direction = 3;  // change the direction to 3, so that can traverse from bottom to top
            }
            else if(direction == 3){	// traversing leftmost col of the untraversed array from bottom to top
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
                direction = 0;
            }
        }
        return list;
    }

	public static void main(String[] args) {
		int[][] matrix = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
		        { 7, 8, 9 }
		};
		System.out.print("Output " + spiralOrder(matrix));
	}

}
