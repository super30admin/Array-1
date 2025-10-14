// Time Complexity : O(m*n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : We maintain four boundaries top, left, right and bottom and parse in the spiral way. After completing a row or a column we compress the
// corresponding boundary by 1 and continue the process until the boundaries won't cross each other.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int top = 0;
        int left = 0;
        int bottom = m - 1;
        int right = n - 1;
        while (top <= bottom && left <= right) { //base case where boundaries won't cross each other
            for (int j = left; j <= right; j++) { //traversing from left to right
                res.add(matrix[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {//traversing from top to bottom
                res.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) { //condition check again as we incremented top.
                for (int j = right; j >= left; j--) {//traversing from right to left
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if (left <= right) { //condition check again as we decremented right
                for (int i = bottom; i >= top; i--) { //traversing from bottom to top
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;

    }
}