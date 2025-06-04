import java.util.ArrayList;
import java.util.List;

class SpiralOrder {
    /*
    * Approach :
    * We have 4 bounds left, right, top and bottom. while the bounds are maintained we go from left to right, top to bottom , right to left and bottom to top and continue till the conditions are breached,
    * TC: O(m*n) where m is the number of rows and n is the number of columns in matrix
    * SC: O(1) since we are directly storing result in the list we are sending back as output
    *
    * */
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        List<Integer> result = new ArrayList<>();

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}