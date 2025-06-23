// Time Complexity : O(m * n) — where m is number of rows and n is number of columns
// Space Complexity : O(m * n) — due to recursion stack in the worst case (if the matrix is very wide or tall), and result list
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// This is a recursive approach to spiral traversal.
// At each recursive step, the function adds top row, right column, bottom row, and left column elements (if applicable),
// then shrinks the boundaries (top++, bottom--, left++, right--) and recurses on the smaller submatrix.

class Solution {
    List<Integer> res;

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        this.res = new ArrayList<>();
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;

        helper(matrix, left, right, top, bottom);
        return res;
    }

    private void helper(int[][] matrix, int left, int right, int top, int bottom) {
        // Base condition: if boundaries cross, stop recursion
        if (left > right || top > bottom) return;

        // Traverse from left to right on the top row
        for (int i = left; i <= right; i++) {
            res.add(matrix[top][i]);
        }
        top++;

        // Traverse from top to bottom on the right column
        for (int i = top; i <= bottom; i++) {
            res.add(matrix[i][right]);
        }
        right--;

        // Traverse from right to left on the bottom row (if still within bounds)
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;
        }

        // Traverse from bottom to top on the left column (if still within bounds)
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }

        // Recursive call with updated boundaries
        helper(matrix, left, right, top, bottom);
    }
}