//Time Complexity O(N*M)
//Space Complexity: O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new ArrayList<Integer>();

        List<Integer> output = new ArrayList<>();

        int top = 0, left = 0;
        int bottom = matrix.length - 1, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // top row: left->right
            for (int i = left; i <= right; i++) {
                output.add(matrix[top][i]);
            }

            top++;
            // right col: top->down
            for (int i = top; i <= bottom; i++) {
                output.add(matrix[i][right]);
            }
            right--;

            // bottom row: right->left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    output.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // left col: bottom to up
                for (int i = bottom; i >= top; i--) {
                    output.add(matrix[i][left]);
                }
                left++;
            }

        }

        return output;
    }
}