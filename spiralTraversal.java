// Time Complexity :O(m*n) where m is no of rows and n is no of columns
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes


class spiralTraversal {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return result;

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom) {
            // left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);

            }
            top++;
            // top to bottom

            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);

                }
                right--;
            }

            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);

                }
                bottom--;
            }

            // bottom to top
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