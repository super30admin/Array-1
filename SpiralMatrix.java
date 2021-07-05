// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Declaring an array list of type integers
        List<Integer> ans = new ArrayList<>();

        // if length of matrix is 0 then return empty arraylist
        if (matrix.length == 0) {
            return ans;
        }

        // storing number of rows and columns in a matrix given
        int row = matrix.length;
        int column = matrix[0].length;

        // declaring four pointers to keep track of row and column we choose
        int left = 0;
        int right = column - 1;
        int top = 0;
        int bottom = row - 1;

        while (left <= right && top <= bottom) {
            // top
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // right
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // bottom
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }

        }

        return ans;
    }
}
