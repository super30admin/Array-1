/**
 Time complexity: O(m * n)
 Space: O(1)
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }

            top++;

            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            right--;

            //so here up we incremented top so we need to check if it is not crossing bottom
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }

                left++;
            }
        }

        return result;
    }
}