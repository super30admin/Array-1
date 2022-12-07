// Spiral Matrix
// Time Complexity : O(mn); m&n are row & column
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// things to notice: every time the boundary is getting squeez. Make corner cases according to that.
// we are moving from left->right, top->bottom, right->left, bottom->top
// Also we have to check the intesecting case, when the left crosses right & top crosses bottom. Check the base condition after every layer.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new ArrayList<Integer>();

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m-1;
        int left = 0, right = n-1;
        List<Integer> result = new ArrayList<>();

        while(top <= bottom && left <= right) {
            //top row
            for(int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            //right column
            if(top <= bottom) {
                for(int i = top; i<= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }

            //bottom row
            if(top <= bottom) {
                for(int j = right; j>= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            //left column
            if(left <= right) {
                for(int i = bottom; i>= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}