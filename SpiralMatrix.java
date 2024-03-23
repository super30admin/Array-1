// Time Complexity : O(n * m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();      
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;
        int top = 0;
        int count = m*n;

        while (count > 0) {
            
            for(int j = left; j <= right; j++) {
                count--;
                result.add(matrix[top][j]);
            }
            top++; 
            
            if(count > 0) {
                for(int i = top; i <= bottom; i++){
                    count--;
                    result.add(matrix[i][right]);
                }
                right--;
            }

            if(count > 0){
                for(int j = right; j >= left; j--){
                    count--;
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            
            if(count > 0){
                for(int i = bottom; i >= top; i--){
                    count--;
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
