// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :

// Maintain four boundaries (top, bottom, left, right) representing the current layer of the matrix.
// Traverse the top row, right column, bottom row, and left column in order, then shrink the boundaries.
// Continue processing inner layers until all elements have been visited in spiral order.

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();

        int left = 0, top = 0, right = matrix[0].length-1, bottom = matrix.length-1;

        while(left <= right && top <= bottom) {
            for(int i=left; i<=right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if(bottom>=top) {
                for(int i=right; i>=left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right) {
                for(int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}