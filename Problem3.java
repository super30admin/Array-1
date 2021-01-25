// Link: https://leetcode.com/problems/search-a-2d-matrix-ii/

// Time Complexity: (M+N)
// Space Complecity: O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        int x = 0, y = matrix[0].length - 1;
        
        while(x < matrix.length && y >= 0) {

            if (target == matrix[x][y])
                return true;
            
            if (target > matrix[x][y]) {
                x++;
            } else {
                y--;
            }
        }
        
        return false;
    }
}