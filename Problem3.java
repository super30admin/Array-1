import java.util.ArrayList;
import java.util.List;

/*
Spiral of a Matrix
time: O(mxn)
space: O(1)
 */
public class Problem3 {
    static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int top = 0, right = n-1, bottom = m-1, left = 0;
        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                result.add(matrix[j][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }

            bottom--;

            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    result.add(matrix[j][left]);
                }
            }
            left++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
