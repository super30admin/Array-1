// Time Complexity : o( m *n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// important to draw the matrix and visualize whats happening
// usage of top, bottom, left, right pointers to simplify
// important to check pointer out  of bounds within while loop
// no need to validate pointer for first two for loops cuz for first loop already the outer while loop takes care
// and second for loop itself checks for top pointers bounds
// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        while(top <= bottom && left <= right) {
            //moving left to right
            for(int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            //top to bottom
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            //right to left
            if(top <= bottom) {
            for(int j = right; j>= left; j--) {
                result.add(matrix[bottom][j]);
            }
                }
            bottom--;
            //bottom to top
            if(left <= right) {
            for(int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
                 }
        }
           
        return result;
    }
}