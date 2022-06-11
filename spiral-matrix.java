// Time Complexity : O(m*n)
// Space Complexity : O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int bottom = m - 1;
        int top = 0;
        int right = n - 1;
        while (result.size() <= (m * n - 1)) {
            // top
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            // right
            if (result.size() > (m * n - 1))
                break;
            for (int j = top; j <= bottom; j++) {
                result.add(matrix[j][right]);
            }
            right--;
            if (result.size() > (m * n - 1))
                break;
            // bottom
            for (int j = right; j >= left; j--) {
                result.add(matrix[bottom][j]);
            }
            bottom--;
            if (result.size() > (m * n - 1))
                break;
            // left
            for (int j = bottom; j >= top; j--) {
                result.add(matrix[j][left]);
            }
            left++;

        }
        return result;
    }
}