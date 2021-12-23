import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {

        // TC : O(M*N)
        // SC : O(1)

        int top = 0;
        int bottom = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        int dir = 0;
        int count = matrix.length * matrix[0].length;

        List<Integer> ar = new ArrayList<Integer>();

        while (top <= bottom && left <= right) {
            if (dir == 0 && count >= 1) {
                for (int i = left; i <= right; ++i) {
                    ar.add(matrix[top][i]);
                }
                top = top + 1;
                count--;

            } else if (dir == 1 && count > 0) {
                for (int i = top; i <= bottom; ++i) {
                    ar.add(matrix[i][right]);
                }
                right = right - 1;
                count--;

            }

            else if (dir == 2 && count > 0) {
                for (int i = right; i >= left; --i) {
                    ar.add(matrix[bottom][i]);
                }
                bottom = bottom - 1;
                count--;

            } else if (dir == 3 && count > 0) {
                for (int i = bottom; i >= top; --i) {
                    ar.add(matrix[i][left]);
                }
                left = left + 1;
                count--;

            }

            dir = (dir + 1) % 4;

        }

        return ar;

    }
}
