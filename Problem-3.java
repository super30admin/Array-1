// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//Traverse the matrix layer by layer in a spiral order, moving top row → right column → bottom row → left column.
// After completing each side, update the boundaries (top++, bottom--, left++, right--) to move inward.
// put four pointers. Repeat until all elements are added to the output list.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return output;

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (left <= right && top <= bottom) {
            // Top row
            for (int i = left; i <= right; i++) {
                output.add(matrix[top][i]);
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                output.add(matrix[i][right]);
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    output.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    output.add(matrix[i][left]);
                }
                left++;
            }
        }

        return output;
    }
}
