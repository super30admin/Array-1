// Time Complexity: O(m * n)
// Space Complexity: O(m * n)

// Use top, bottom, left and right to denote the boundaries, and keep shrinking them after recording all values in each of the outer rows

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, left = 0, bottom = matrix.length-1, right = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();
        while (top <= bottom && left <= right) {
            // left to right in top row
            for (int i=left; i<=right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            // top to bottom in right column            
            for (int i=top; i<=bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            // right to left in bottom row
            if (top<=bottom) {
                for (int i=right; i>=left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom to top in left column
            if (left<=right) {
                for (int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
