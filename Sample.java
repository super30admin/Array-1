// Time Complexity :O(m × n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// We maintain four boundaries: top, bottom, left, and right, and traverse the matrix in spiral order layer by layer.
// After each directional traversal (left to right, top to bottom, etc.), we adjust the respective boundary.
// This continues until all rows and columns are traversed.

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Define the four boundaries of the matrix
        int top = 0;
        int bottom = m - 1;
        int right = n - 1;
        int left = 0;

        List<Integer> result = new ArrayList<>();

        // Loop until the boundaries overlap
        while (top <= bottom && left <= right) {

            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // Move top boundary down

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Move right boundary left

            // Traverse from right to left, only if there's a remaining row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Move bottom boundary up
            }

            // Traverse from bottom to top, only if there's a remaining column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Move left boundary right
            }
        }
        return result;
    }
}

// Time Complexity :O(n)
// Space Complexity :O(n) Due to the use of two extra arrays left[] and right[]

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        // Initialize left product array
        left[0] = 1;
        int rp = 1;
        for (int i = 1; i < nums.length; i++) {
            rp = rp * nums[i - 1];
            left[i] = rp;
        }

        // Initialize right product array
        rp = 1;
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            right[i] = rp;
        }

        // Multiply left and right products for the final result
        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}

