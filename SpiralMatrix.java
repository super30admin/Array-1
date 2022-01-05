// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return result;

        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;

        while (true) {
            //  Top Row
            for (int j = left; j <= right; ++j) {
                result.add(matrix[top][j]);
            }
            top++;

            if (top > bottom)
                break;

            //  Right Col
            for (int i = top; i <= bottom; ++i) {
                result.add(matrix[i][right]);
            }
            right--;

            if (left > right)
                break;

            //  Bottom Row
            for (int j = right; j >= left; --j) {
                result.add(matrix[bottom][j]);
            }
            bottom--;

            if (top > bottom)
                break;

            //  Left Col
            for (int i = bottom; i >= top; --i ) {
                result.add(matrix[i][left]);
            }
            left++;

            if (left > right)
                break;
        }

        return result;
    }
}
