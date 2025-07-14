import java.util.ArrayList;
import java.util.List;

//TC: O(m * n)
//SC: O(1)
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
        List<Integer> result = new ArrayList<>();
        while(top <= bottom && left <= right) {
            //Move from left to right
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            //Move from top  to bottom
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            //Move from right  to left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //Move from bottom  to top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }


        }
        return result;
    }
}