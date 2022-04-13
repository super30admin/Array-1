/**
Problem: https://leetcode.com/problems/spiral-matrix/
TC: O(m * n)
SC: O (1)
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0; 
        int right = n - 1;
        
        while (top <= bottom && left <= right) {
            // Left to right
            for (int j = left; j <= right; ++j) {
                result.add(matrix[top][j]);
            }
            ++top;
            
            // Top to bottom
            // If top and bottom goes out of bounds, the for loop will take care of it.
            // We don't need to take care of left and right because we haven't updated it since the check within while loop. So we know it is valid.
            for (int i = top; i <= bottom; ++i) {
                result.add(matrix[i][right]);
            }
            --right;
            
            // Right to left
            // If left and right goes out of bounds, the for loop will take care of it.
            // But we need to take care of top and bottom because we updated top.
            if (top <= bottom) { 
                for (int j = right; j >= left; --j) {
                    result.add(matrix[bottom][j]);
                }
                --bottom;
            }

            // Bottom to top
            // If top and bottom goes out of bounds, the for loop will take care of it.
            // But we need to take care of left and right because we updated right.
            if (left <= right) { 
                for (int i = bottom; i >= top; --i) {
                    result.add(matrix[i][left]);
                }
                ++left;
            }
        }
        return result;
    }
}