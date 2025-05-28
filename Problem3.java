// Time Complexity : O(m*n) m & n are row & column Length resp.
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : Yes



class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return result;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from Left to Right
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;

            // Traverse from Top to Bottom
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            // Only if there is a remaining row
            if (top <= bottom) {
                // Traverse from Right to Left
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // Only if there is a remaining column
            if (left <= right) {
                // Traverse from Bottom to Top
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }

        }

        return result;
    }
}