// Time Complexity : O(m x n)
// Space Complexity : O(m x n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0; int bottom = m -1;
        int left = 0; int right = n - 1;

        while (top <= bottom && left <= right) {
            //top 
            for (int j = left; j <= right; j ++) {
                result.add(matrix[top][j]);
            }
            top ++;

            //right
            for (int i = top; i <= bottom; i ++) {
                result.add(matrix[i][right]);
            }
            right --;

            //bottom
            if (top <= bottom) {
            for (int j = right; j >= left; j --) {
                result.add(matrix[bottom][j]);
            }
            bottom --;
            }

            if (left <= right){
            //left
            for (int i = bottom; i >= top; i --) {
                result.add(matrix[i][left]);
            }
            left ++;
            }
        }
        return result;
    }
}