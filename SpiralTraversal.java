// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0) return new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while (left<=right && top<=bottom) {
            // to go lef to right
            if (top<=bottom) {
                for (int i=left; i<=right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }


            // to go top to bottom
            if (left<=right) {
                for (int i=top; i <= bottom; i++ ) {
                    result.add(matrix[i][right]);
                }
                right--;
            }

            // to go right to left
            if (top<=bottom) {
                for (int i=right; i>=left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // to go bottom to top
            if (left<=right) {
                for (int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            System.out.println(top+bottom+left+right);

        }

        return result;

    }
}