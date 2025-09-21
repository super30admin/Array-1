// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;//rows
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (left <= right && top <= bottom) {
            //top row
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            //right row
            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    res.add(matrix[i][right]);
                }
            }
            right--;
            //bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
            }
            bottom--;
            //left row
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
        }

        return res;
    }
}