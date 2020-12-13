/**
 * Time Complexity:O(m x n)
 * Space Complexity: O(1)
 * LeetCode: Y(https://leetcode.com/problems/spiral-matrix/)
 * Approach: Go right, down, left, up while updating the boundaries. 
             Also check if boundaries are valid before traversing the matrix.
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralTraversal = new ArrayList<Integer>();
        // check for edge case
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return spiralTraversal;
        }
        
        // intialize boundaries
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        // iterate until a valid boundary exists
        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            // go from left to right on top
            for(int i = colBegin ; i <= colEnd ; i++) {
                spiralTraversal.add(matrix[rowBegin][i]);
            }
            // move the upper boundary down
            rowBegin++;
            
            // go from top to bottom on right
            for(int i = rowBegin ; i <= rowEnd ; i++) {
                spiralTraversal.add(matrix[i][colEnd]);
            }
            // move the right boundary left
            colEnd--;
            
            // go from right to left on bottom
            if(rowBegin <= rowEnd && colBegin <= colEnd) {
                for(int i = colEnd ; i >= colBegin ; i--) {
                    spiralTraversal.add(matrix[rowEnd][i]);
                }
                // move the lower boundary up
                rowEnd--;
            }
            
            // go from bottom to top on left
            if(rowBegin <= rowEnd && colBegin <= colEnd) {
                for(int i = rowEnd ; i >= rowBegin ; i--) {
                    spiralTraversal.add(matrix[i][colBegin]);
                }
                // move the left boundary right
                colBegin++;
            }
        }
        
        return spiralTraversal;
    }
}
