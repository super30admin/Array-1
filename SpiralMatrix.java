
/* 54. Spiral Matrix
Given an m x n matrix, return all elements of the matrix in spiral order.
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/
/*
Time Complexity:-O(m*n)
Space Complexity:-O(1)
Approach:-
We use four boundaries (top, bottom, left, right) to keep track of where we are in the matrix.
We simulate the spiral traversal:
Move left to right along the top row.
Move top to bottom along the right column.
Move right to left along the bottom row (if applicable).
Move bottom to top along the left column (if applicable).
After each direction, we shrink the boundary inward.*/
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Handle edge case: empty matrix
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        int m = matrix.length; // number of rows
        int n = matrix[0].length;// number of columns
        int top = 0, bottom = m - 1, left = 0, right = n - 1; // Define the boundaries of the spiral
        List<Integer> result = new ArrayList<>();// to store spiral order
        // Continue while we have a valid layer to process
        while (top <= bottom && left <= right) {
            // Traverse from left to right on the top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;// move the top boundary down
            // Traverse from top to bottom on the right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;// move the right boundary left
            // Check and traverse bottom row (right to left), if still valid
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;// move the bottom boundary up
            }
            // Check and traverse left column (bottom to top), if still valid
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;// move the left boundary right
            }
        }
        return result; // return final spiral order
    }
}
