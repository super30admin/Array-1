// Time Complexity :    O(n)
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : This code uses top, bottom, left, right boundaries. Each direction is clearly handled in a fixed sequence inside the loop. The inner if checks avoid redundant passes when the matrix has odd dimensions.

// Your code here along with comments explaining your approach

class problem-3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return result;

        int r = matrix.length;
        int c = matrix[0].length;

        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;

        while (top <= bottom && left <= right) {
            // Move right →
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Move down ↓
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Move left ←
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Move up ↑
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
