// Time Complexity : O(M*N) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Take four pointers top, bottom, left and right and incremen/decrement as we want to move in the matrix
import java.util.*;
class SpiralMatrixSolution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length==0)
            return result;
        int left = 0, right = matrix[0].length-1;
        int top = 0, bottom = matrix.length-1;
        while(top<=bottom && left<=right) {
            if(top<=bottom && left<=right) {
                for(int i=left; i<=right;i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }

            if(top<=bottom && left<=right) {
                for(int i=top; i<=bottom;i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }
            if(top<=bottom && left<=right) {
                for(int i=right; i>=left;i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(top<=bottom && left<=right) {
                for(int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}