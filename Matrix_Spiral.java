import java.util.ArrayList;
import java.util.List;

class Solution {
    /*
     * Time - O(m*n)
     * Space - O(1)
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;
        List<Integer> result = new ArrayList<>();
        
        while (top<=bottom && left<=right) {
            // no need to check if top<=bottom since upper while condition will handle that
            for (int i=left; i<=right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            // no need to check if left<=right since after while condition above, we are not changing left and right
            for (int i=top; i<=bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            // check if top<=bottom
            if (top<=bottom) {
                for (int i=right; i>=left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            
            // check if left<=right
            if (left<=right) {
                for (int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}