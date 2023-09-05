//TC: O(M*N) SC: O(1)

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>  ans = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        while(left <= right && top <= bottom) {
            //top
            for(int j = left; j <= right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            //right
            for(int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            //bottom
            if(top <= bottom) {
                for(int j = right; j >= left; j--) {
                    ans.add(matrix[bottom][j]);
                }
            }
            bottom--;

            //left
            if(left <= right) { 
                for(int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
            }
            left++;
        }   
        return ans;
    }
}
