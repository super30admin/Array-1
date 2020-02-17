// Time Complexity : O(MN)
// Space Complexity : O(min(M,N)) for recursive and O(1) for iterative
// Did this code successfully run on Leetcode : yes

/*
Approach:
1. As soon as we see the question, it is clear that we need to play with boundaries to get the spiral order
2. Shrink the boundaries of the matrix as we iterate through top row,right column , bottom row and left column in respective order
3. Most important step here is to check if top crosses bottom when iterating through rightmost column and if left crossed right when iterating through leftmost column, as we have updated them in previous two steps
*/

// ========================== Recursive approach =================================
class Solution {
    
    List<Integer> result;
    public List<Integer> spiralOrder(int[][] matrix) {
        result = new ArrayList<>();
        if( matrix == null || matrix.length == 0) return result;
        
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        helper(matrix, left, right, top, bottom);
        return result;
    }
    
    private void helper(int[][] matrix, int left, int right, int top, int bottom) {
        // base case
        if( left > right || top > bottom) return;
        // logic
        
        if( left <= right && top <= bottom) {
            // iterating left to right, so row is top
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            // iterating top to bottom, so column is right
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            // iterating right to left, so row is bottom 
            if( top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // iterating bottom to top, so column is left
            if( left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
         helper(matrix, left, right, top, bottom);
        
    }
}

// ========================== Iterative approach =================================

class Solution {
    
    List<Integer> result;
    public List<Integer> spiralOrder(int[][] matrix) {
        result = new ArrayList<>();
        if( matrix == null || matrix.length == 0) return result;
        
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        
        while ( left <= right && top <= bottom) {
            // iterating left to right, so row is top
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            // iterating top to bottom, so column is right
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            // iterating right to left, so row is bottom 
            if( top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // iterating bottom to top, so column is left
            if( left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}