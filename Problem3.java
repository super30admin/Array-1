// Time Complexity : O(m*n) where m is the length of the matrix, n is the length of each row
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Maintain the boundary conditions and loop over the matrix based on the boundary conditions

// Your code here along with comments explaining your approach

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length - 1, n = matrix[0].length - 1;
        int top = 0, left = 0, right = n, bottom = m;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i += 1) {
                res.add(matrix[top][i]);
            }
            top += 1;

            for (int i = top; i <= bottom; i += 1) {
                res.add(matrix[i][right]);
            }
            right -= 1;

            if (top <= bottom) {
                for (int i = right; i >= left; i -= 1) {
                    res.add(matrix[bottom][i]);
                }
            }
            bottom -= 1;

            if (left <= right) {
                for (int i = bottom; i >= top; i -= 1) {
                    res.add(matrix[i][left]);
                }
            }
            left += 1;
        }

        return res;
    }
}