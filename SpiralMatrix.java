// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * We traverse the array clockwise and layer by layer.
 * Everytime, we print one layer, we are left with a subproblem of the original problem.
 * We keep boundary pointers to keep track of the layer boundary.
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // We will be using the approach of printing the elements of the matrix layer by layer
        
        List<Integer> result = new ArrayList<>();
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int row_start = 0;
        int row_end = rows - 1;
        
        int col_start = 0;
        int col_end = cols - 1;
        
        while(row_start <= row_end && col_start <= col_end) {
            // Move right
            int col_start_nav = col_start;
            while(col_start_nav <= col_end) {
                result.add(matrix[row_start][col_start_nav]);
                col_start_nav++;
            }
            row_start++;
            
            // move down
            int row_start_nav = row_start;
            while(row_start_nav <= row_end) {
                result.add(matrix[row_start_nav][col_end]);
                row_start_nav++;
            }
            col_end--;
            
            //move left
            int col_end_nav = col_end;
            while( row_start <= row_end && col_end_nav >= col_start) {
                result.add(matrix[row_end][col_end_nav]);
                col_end_nav--;
            }
            row_end--;
            
            //move up
            int row_end_nav = row_end;
            while(col_start <= col_end && row_end_nav >= row_start) {
                result.add(matrix[row_end_nav][col_start]);
                row_end_nav--;
            }
            col_start++;
        }
        return result;
    }
}