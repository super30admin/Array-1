// Time Complexity : O(n*m)
// Space Complexity : O(1) as the res list should not be counted as 'extra' space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - I made up, down, left and right limits to traverse, I move these indices the way shown in the problem, first right (the row is finished, so we move up limit as the next row), then down (right most column is done, so we move right to one column back) then left (last row is done, we set down to go one row up) and then up (left column is done, we move it one right) and keep repeating till we finish all the elements.

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int up = 0, down = m - 1;
        int left = 0, right = n - 1;
        List<Integer> res = new ArrayList<>();
        
        while (res.size() < m * n) {
            // right
            for (int j = left; j <= right && res.size() < m * n; j++) {
                res.add(matrix[up][j]);
            }
            up++;

            // down
            for (int i = up; i <= down && res.size() < m * n; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            // left
            for (int j = right; j >= left && res.size() < m * n; j--) {
                res.add(matrix[down][j]);
            }
            down--;

            // up
            for (int i = down; i >= up && res.size() < m * n; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
