class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList();
        }

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList();
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            for(int l = left; l <= right; ++l) {
                result.add(matrix[top][l]);
            }
            top++;

            for(int t = top; t <= bottom; ++t) {
                result.add(matrix[t][right]);
            }
            right--;

            if (top <= bottom) {
                for(int r = right; r >= left; --r) {
                    result.add(matrix[bottom][r]);
                }
            }
            bottom--;

            if (left <= right) {
                for(int b = bottom; b >= top; --b) {
                    result.add(matrix[b][left]);
                }
            }
            left++;
        }

        return result;
    }


}