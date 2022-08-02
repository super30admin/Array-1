import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(mn), where m= number of rows of matrix, n = number of columns of matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach :
// 1. Define the direction and move the row and column pointers
// 2. If the direction is upwards, it either breaches right and top side of matrix, hence identified edge cases for them and handled for up direction
// 3. If the direction is downwards, it either breaches left or down side of matrix, hence identified edge cases for them and handled for down direction

// 54. Spiral Matrix (Medium) - https://leetcode.com/problems/spiral-matrix/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) return result;
        
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        
        while (top <= bottom && left <= right) {
            // left to right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            
            // top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            // right to left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;
            
            //bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        
        return result;
    }
}