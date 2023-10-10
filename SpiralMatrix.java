/* Time Complexity : O(m*n) 
 * 	m - no. of rows of the matrix
 *  n - no. of cols of the matrix  */
/* Space Complexity : O(1) - no auxiliary DS (excluding i/p and o/p array)*/
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; //row
        int n = matrix[0].length; //column

        //boundaries
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        
        List<Integer> li = new ArrayList<>();

        //broundary pairs do not cross each other
        while(left <= right && top <= bottom){
            //top row
            for(int j = left; j <= right; j++){
                li.add(matrix[top][j]);                
            }
            top++;

            
            //right col
            for(int i = top; i <= bottom; i++){//for loop handles if top crosses bottom  (top > bottom)
                li.add(matrix[i][right]);                
            }
            right--;
            

            if(top <= bottom){
                //bottom row
                for(int j = right; j >= left; j --){//for loop handles if left crosses right  (left > right)
                    li.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if(left <= right){
                //left col
                for(int i  = bottom; i >= top; i--){//for loop handles if top crosses bottom  (top > bottom)
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }

        return li;
    }
}
