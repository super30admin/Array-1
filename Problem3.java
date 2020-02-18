// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//Used 4 pointers. top,left,bottom and right. Checked for if top<=bottom and left<=right then added value accordingly to the rows and columns accordingly

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1, left = 0, right = n - 1;
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

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;

        }

        return result;

    }
}