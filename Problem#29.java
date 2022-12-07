// Spiral Matrix

// Time Complexity : O(m.n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Traverse the matrix is concentric squares. Start with the top row, increment the value for top after it is traversed. Traverse the right column next, decrement the value for right after it is traversed. Traverse the bottom row next, decrement the value for bottom after it is traversed. Repeat until top and bottom overlap and left and right overlap.

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; // Rows
        int n = matrix[0].length; // Columns
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        List<Integer> result = new ArrayList<>();
        while(top <= bottom && left <= right){
            //Top row - left to right
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++; // Shrink top after traversing and adding all the elements to the output array
            //Right column - top to bottom
            if(top <= bottom && left <= right){ // Keep checking this condition because we are incrementing/decrementing top, bottom, left and right within the loop as well
                for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--; // Shrink right column after traversing and adding all the elements to the output array
            }
            //Bottom Row - right to left
            if(top <= bottom && left <= right){ // Keep checking this condition because we are incrementing/decrementing top, bottom, left and right within the loop as well
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Shrink bottom row after traversing and adding all the elements to the output array
            }
            //Left column - bottom to top
            if(top <= bottom && left <= right){ // Keep checking this condition because we are incrementing/decrementing top, bottom, left and right within the loop as well
                for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left++; // Shrink left column after traversing and adding all the elements to the output array
            }
        }
        return result;
    }
}