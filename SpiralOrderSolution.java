// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Using 4 direction variables

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderSolution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i += 1) {
                result.add(matrix[top][i]);
            }
            top += 1;
            
            for(int i = top; i <= bottom; i += 1) {
                result.add(matrix[i][right]);
            }
            right -= 1;
            
            if(top <= bottom) {
                for(int i = right; i >= left; i -= 1)  {
                    result.add(matrix[bottom][i]);
                }
                bottom -= 1;
            }
            
            if(left <= right) {
                for(int i = bottom; i >= top; i -= 1)  {
                    result.add(matrix[i][left]);
                }
                left += 1;
            }
        }
        return result;
    }
}
