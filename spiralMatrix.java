// Time Complexity : O(mn), m and n is the size of the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
 * Iterate through directions and squeeze the matrix.
 * Also check base conditions before reducing
 */
// Your code here along with comments explaining your approach
public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix.length == 0 || matrix == null)
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (left <= right && top <= bottom) {
            // after every traversal squeeze the matrix
            // traverse from left to right
            if (left <= right && top <= bottom) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
            }

            top++;
            // traverse from top to bottom
            if (left <= right && top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
            }

            right--;
            // traverse from right to left
            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }

            bottom--;
            // traverse from bottom to top
            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }

        return result;

    }

}
