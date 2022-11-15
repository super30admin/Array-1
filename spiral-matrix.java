import java.util.*;

//run time is O(mxn)
//space complexity is O(1) if we don't count the extra space required to store the result.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> res = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // move from left to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }

            top++;

            if (left <= right) {
                // move from top to bottom
                for (int i = top; i <= bottom; i++) {
                    res.add(matrix[i][right]);
                }
                right--;
            }

            // from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }

                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }

                left++;
            }

        }

        return res;

    }
}