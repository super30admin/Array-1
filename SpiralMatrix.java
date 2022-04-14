import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    // Time complexity: O(m * n)
    // Space complexity: O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return null;
        List<Integer> result = new ArrayList<>();

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while(top <= bottom && left <= right) {

            // Go from left to right
            for(int i=left; i <= right; i ++){
                result.add(matrix[top][i]);
            }
            top++;

            // Go from top to bottom
            for(int i=top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Go from right to left only in case top <= bottom
            if(top <= bottom) {
                for(int i=right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Go from bottom to top only if left <= right
            if(left <= right) {
                for(int i=bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
