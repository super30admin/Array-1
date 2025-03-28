class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        List<Integer> result = new ArrayList<>();
        while (left <= right && top <= bottom) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                result.add(mat[top][i]);
            }
            top++;

            // Traverse downwards along the right column
            if (left <= right && top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    result.add(mat[i][right]);
                }
                right--;
            }

            // Traverse from right to left along the bottom row
            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }

            // Traverse upwards along the left column
            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
