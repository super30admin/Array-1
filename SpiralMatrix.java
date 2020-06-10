// Time Complexity : O(n * m) where n & m are length of input matrix
// Space Complexity : O(1) --> as the extra space O(m * n) which we are creating are returning as output so will not considered as auxillary space
// Did this code successfully run on Leetcode (54): Yes
// Three line explanation of solution in plain english: In this problem, we are simply iterating over the 2D-matrix. We maintain the order of direction while traversing. First we move from left --> right, top --> bottom, right --> left, bottom --> top. We are reducing the length of top, bottom, left and right end points once reached dead end of the matrix.

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>(); 
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while (left <= right && top <= bottom) {
            
            if (left <= right && top <= bottom) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }
            
            if (left <= right && top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }
            
            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}