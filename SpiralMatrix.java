// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
// 1: We have 4 variables to maintain our position in the matrix array
// 2: For each type of traversal, we have a for loop that uses the necessary conditions to determine which elements to add in the output ArrayList
// 3: Since we are using a while loop, we have additional checks with if statements to ensure that our pointers are still valid in the matrix
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            // top row
            for (int j = left; j <= right; j++) {
                li.add(matrix[top][j]);
            }
            top++;

            // right column
            for (int i = top; i <= bottom; i++) {
                li.add(matrix[i][right]);
            }
            right--;

            // bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    li.add(matrix[bottom][j]);
                }
            }
            bottom--;

            // left column
            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    li.add(matrix[j][left]);
                }
            }
            left++;
        }
        return li;
    }
}