class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Check if the input matrix is empty or null
        if (matrix.length == 0 || matrix == null)
            return new ArrayList<>();

        int m = matrix.length;  // Number of rows in the matrix
        int n = matrix[0].length;  // Number of columns in the matrix

        int top = 0, left = 0;  // Initialize indices for the top row and left column
        int right = n - 1;  // Initialize index for the rightmost column
        int bottom = m - 1;  // Initialize index for the bottom row

        List<Integer> result = new ArrayList<>();  // List to store the elements in spiral order

        // Traverse the matrix in a spiral order
        while (top <= bottom && left <= right) {
            // Move and capture all elements in the top row from left to right
            for (int i = left; i <= right; i++)
                result.add(matrix[top][i]);
            top++;

            // Move and capture all elements from top to bottom in the rightmost column
            for (int i = top; i <= bottom; i++)
                result.add(matrix[i][right]);
            right--;

            // Move and capture all elements from right to left in the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result.add(matrix[bottom][i]);
                bottom--;
            }

            // Move and capture all elements from bottom to top in the leftmost column
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }

        return result;  // Return the result list containing elements in a spiral order
    }
}
