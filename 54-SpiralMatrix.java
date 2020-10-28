/**LC-54
 * Time Complexity : O(m*n)
 * Space Complexity : O(1) since we are returning the result array...it is not considered as an auxiliary space
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : Yes.
 * -> Inside the while loop, I did not check whether the base condition is being breached or not.
 *
 Algorithm:
 1. Here I have maintain four pointers top, bottom, right and left.
 2. While left<=right and top<=bottom
    3. take top row and manipulate pointers
    4. take right row and manipulate pointers
    5. take bottom row and manipulate pointers
    6. take left row and manipulate pointers
 */
import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        //edge case
        if(matrix == null || matrix.length == 0) return result;

        int top = 0, bottom = matrix.length - 1, right = matrix[0].length - 1, left = 0;


        while(left<=right && top<=bottom){

            if(top<=bottom){
                for(int i = left; i <= right; i++){
                    result.add(matrix[top][i]);
                }
                top++;
            }
            if(left<=right){
                for(int i = top; i <= bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            if(top<=bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;

    }
}