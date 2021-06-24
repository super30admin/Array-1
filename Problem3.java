// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length; int n = matrix[0].length;
        int top = 0;
        int bottom = m -1;
        int left = 0; int right = n - 1;

        while(left <= right && top <= bottom) {

            // top row L -> R
            for(int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // right column T -> B
            if(left <= right && top <= bottom) {
                for(int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
            }
            right--;

            // bottom row
            if(left <= right && top <= bottom) {
                for(int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;

            // left col
            if(left <= right && top <= bottom) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;

        }
        return result;
    }
}