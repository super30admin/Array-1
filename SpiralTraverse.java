import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    /**
     * Iterative solution
     *
     * Time: O(m*n) Space: O(1)
     */
    public List<Integer> spiralOrder1(int[][] matrix) {
        List <Integer> result = new ArrayList<>();

        if(matrix.length == 0) return result;

        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom){
            // Top row
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            // right column
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            //bottom row
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //left column
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    /**
     * Recursive solution
     *
     * Time: O(m*n) Space: O(1) Stack function call space: O(min(m, n))
     */
    public List<Integer> spiralOrder2(int[][] matrix) {
        List <Integer> result = new ArrayList<>();

        if(matrix.length == 0) return result;

        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        helper(matrix, top, right, bottom, left, result);
        return result;
    }

    private void helper(int[][] matrix, int top, int right, int bottom, int left, List <Integer> result) {
        //base case
        if (left > right || top > bottom) {
            return;
        }


        //logic
        // Top row
        for(int i = left; i <= right; i++){
            result.add(matrix[top][i]);
        }
        top++;

        // right column
        for(int i = top; i <= bottom; i++){
            result.add(matrix[i][right]);
        }
        right--;

        if(top <= bottom){
            for(int i = right; i >= left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
        }


        if(left <= right){
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }

        helper(matrix, top, right, bottom, left, result);
    }
}
