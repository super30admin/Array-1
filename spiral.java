//Time Complexity (TC): O(m × n)
//Space Complexity (SC): O(1) 


//Use four boundaries: top, bottom, left, and right to define the current layer of the matrix.
//Traverse the matrix in four directions: left to right, top to bottom, right to left, and bottom to top, updating boundaries after each traversal.
//Continue the process until all elements are visited and added to the result list in spiral order.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        List<Integer> spiralResult = new ArrayList<>();
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {

            // Traverse from Left to Right
            for (int col = left; col <= right; col++) {
                spiralResult.add(matrix[top][col]);
            }
            top++;

            // Traverse from Top to Bottom
            for (int row = top; row <= bottom; row++) {
                spiralResult.add(matrix[row][right]);
            }
            right--;

            // Traverse from Right to Left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    spiralResult.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // Traverse from Bottom to Top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    spiralResult.add(matrix[row][left]);
                }
                left++;
            }
        }

        return spiralResult;
    }
}
