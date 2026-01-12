// Time Complexity : O(m*n)
// Space Complexity : O(1)  (excluding output list)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, just need to update boundaries properly to avoid duplicates.


// Your code here along with comments explaining your approach in three sentences only
// I maintain four boundaries (top, bottom, left, right) and keep shrinking them after each traversal.
// I go in order: left to right, top to bottom, right to left, bottom to top while checking boundaries.
// This continues until all elements are added into the list.

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> li = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

            // top row: left -> right
            for (int i = left; i <= right; i++) {
                li.add(matrix[top][i]);
            }
            top++;

            // right col: top -> bottom
            for (int i = top; i <= bottom; i++) {
                li.add(matrix[i][right]);
            }
            right--;

            // bottom row: right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    li.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // left col: bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }

        return li;
    }
}
