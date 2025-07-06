// Time Complexity : O(m * n) where m is number of rows and n is number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

// ## Problem 3
// Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
// Example 1:
// Input:
// [
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
// ]
// Output: [1,2,3,6,9,8,7,4,5]

// Example 2:
// Input:
// [
// [1, 2, 3, 4],
// [5, 6, 7, 8],
// [9,10,11,12]
// ]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Base case: input matrix is null or empty
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }

        int m = matrix.length; // number of rows
        int n = matrix[0].length; // number of columns
        List<Integer> result = new ArrayList<>(); // Result list to store spiral order

        // Defining the boundaries of the matrix
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        // Traversing the matrix in spiral order
        while (top <= bottom && left <= right) {

            // Moving from left to right along the top boundary
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // Shrinking top boundary

            // Moving from top to bottom along the right boundary
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Shrinking right boundary

            // Moving from right to left along the bottom boundary and checking to avoid duplicates
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Shrinking bottom boundary
            }

            // Moving from bottom to top along the left boundary and checking to avoid duplicates
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Shrinking left boundary
            }
        }

        // Returning result list
        return result;
    }
}
