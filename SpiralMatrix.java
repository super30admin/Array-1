import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity: O(M*N)
 * Space Complexity: O(1)
 */
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0 || matrix == null) {
            return result;
        }
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int top = 0;
        int bottom = rowCount - 1;
        int left = 0;
        int right = colCount - 1;

        while (top <= bottom && left <= right) {
            // Top Row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Right Column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Bottom Row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Left Column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> spiralOrder = spiralOrder(matrix);
        System.out.println(spiralOrder);
    }
}
