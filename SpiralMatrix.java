import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(rows*cols)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Iterated clockwise by changing the top, bottom, left and right pointers in the matrix.
//Printed the values while traversing the direction.

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return result;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0; int right = cols-1;
        int top = 0; int bottom = rows-1;

        while(left<=right && top<=bottom){
            //left to right
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            if(left<=right && top<=bottom){
                for(int i= top; i<=bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }

            //right to left
            if(left<=right && top<=bottom){
                for(int i = right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom to top
            if(left<=right && top<=bottom){
                for(int i =bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }//end of while

        return result;
    }
}
