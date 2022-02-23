// Time Complexity : O(m * n) 
// where m is length of matrix rows and n is length of matrix columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int firstRow = 0;
        int firstCol = 0;
        int lastRow = m - 1;
        int lastCol = n - 1;
        
        while (firstRow <= lastRow && firstCol <= lastCol) {
            
            // going right -> j++
            for (int j = firstCol; j <= lastCol; j++) {
                result.add(matrix[firstRow][j]);
            }
            firstRow++;
            
            // going down -> i++
            for (int i = firstRow; i <= lastRow; i++) {
                result.add(matrix[i][lastCol]);
            }
            lastCol--;
            
            if (firstRow <= lastRow) {
                for (int j = lastCol; j >= firstCol; j--) {
                    result.add(matrix[lastRow][j]);
                }
                lastRow--;
            }
            if (firstCol <= lastCol) {
                for (int i = lastRow; i >= firstRow; i--) {
                    result.add(matrix[i][firstCol]);
                }
                firstCol++;
            }
        }
        return result;
    }
}