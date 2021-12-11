// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english (Logic):
// Here we solve this by manipulating the indexes, we consider 4 indexes namely left, right, top and bottom. We have a breaking condition which is left <= right and top <= bottom.
// Once we are done with a perticular row or colomn, we shrink the boundaries by changing the indexes.
// The order of traversal is 1st row, last col, last row, first col and repeat..

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new ArrayList<>();
        int m=matrix.length;    // row
        int n=matrix[0].length; // colomn
        int left=0, right=n-1, top=0, bottom=m-1;
        List<Integer> result = new ArrayList<>();

        while (top<=bottom && left<=right) {
            // traverse row from left to right
            for (int i=left; i<=right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // traverse col from top to bottom
            if(top<=bottom && left<=right) {
                for (int i=top; i<=bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }

            // traverse row from right to left
            if(top<=bottom && left<=right) {
                for (int i=right; i>=left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // traverse col from bottom to top
            if(top<=bottom && left<=right) {
                for (int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}