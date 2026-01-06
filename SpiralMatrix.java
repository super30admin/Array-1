// Time Complexity : O(MXN), Go over each element of the matrix once
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach :
// To traverse in spiral order, we need to move from left to right direction, then top to bottom, them right to left and
// finally bottom to up. So we will use 4 pointers top, bottom, left and right. Since the spiral would be shrinking at
// every level, we need to shrink our boundaries too, thus reduce our pointers by 1 each time.
import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        if (m == 1 && n == 1) {
            result.add(matrix[0][0]);
            return result;
        }

        int top = 0, left = 0;
        int bottom = m - 1, right = n - 1;

        //Keep adding elements till the boundaries cross each other
        // top == bottom or left == right is valid case
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            // check boundaries since pointer was updated in last line
            if (isInvalidBounds(top, bottom)) break;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (isInvalidBounds(left, right)) break;

            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;

            if (isInvalidBounds(top, bottom)) break;

            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }

        return result;
    }

    public boolean isInvalidBounds(int start, int end) {
        return start > end;
    }
}