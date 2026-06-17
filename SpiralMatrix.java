// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Take four pointers ->left, top, right, and bottom.
//And navigate left to right, top to bottom, right to left, bottom to top in that order.
//Increase or decrease the pointers accordingly.

// Your code here along with comments explaining your approach
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = m - 1;

        while (left <= right && top <= bottom) {

            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;


            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;


            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }

        return result;

    }
}
