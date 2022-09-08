// Problem3 - https://leetcode.com/problems/spiral-matrix/submissions/

// Time Complexity : O(m * n )
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We will take 4 flags and iterate the rows & colum accordingly/

public class problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = matrix.length;
        List<Integer> result = new ArrayList();

        int top = 0;
        int right = n - 1;
        int buttom = m - 1;
        int left = 0;
        while (top <= buttom && left <= right) {
            // top row
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // right row
            if (top <= buttom && left <= right) {
                for (int i = top; i <= buttom; i++) {
                    result.add(matrix[i][right]);
                }
            }
            right--;

            if (top <= buttom && left <= right) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[buttom][j]);
                }
            }
            buttom--;

            if (top <= buttom && left <= right) {
                for (int i = buttom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;

    }
}
