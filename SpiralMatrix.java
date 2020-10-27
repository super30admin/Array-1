// Time Complexity : O(m*n) where  m*n is size of the array
// Space Complexity : O(1) not extra auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 * We will maintain 4 pointers (left, right, top, bottom). We will iterate the matrix right, down, left, up
 * and update the pointers accordingly
 * */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;
        while (left<=right && top<=bottom){
            //moving left to right
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //moving down
            if(left<=right && top<=bottom){
                for(int i=top; i<=bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }

            //moving right to left
            if(left<=right && top<=bottom){
                for (int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //moving up
            if(left<=right && top<=bottom){
                for (int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}