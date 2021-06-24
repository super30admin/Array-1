// Time Complexity : O(N) touched all elements once
// Space Complexity : O(N) made new List of space N
// Did this code successfully run on Leetcode : yes, understood the concept but had to refer to code
// Three line explanation of solution in plain english
// Based on boundary conditions, we moved our 4 pointers. We went on top row, then right column, bottom row, left column.
// We move our pointers closer to the middle so we can go in a spiral.

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
        int m = matrix.length; //rows
        int n = matrix[0].length; //columns
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        while(left <= right && top <= bottom){
            //top row
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            //right column
            if(left <= right && top <= bottom){
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            }
            right--;
            //bottom row
            if(left <= right && top <= bottom){
            for(int j = right; j >= left; j--){
                result.add(matrix[bottom][j]);
            }
            }
            bottom--;
            //left column
            if(left <= right && top <= bottom){
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
            }
            left++;
            
        }
        return result;
    }
}