// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
        int top = 0; int right = matrix[0].length - 1;
        int bottom = matrix.length-1; int left = 0;
        while(top <= bottom && left <= right){
            //top row
            for(int j=left; j<=right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            //right col
            if(top <= bottom && left <= right){
                for(int i=top; i<=bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }
            
            //bottom row
            if(top <= bottom && left <= right){
                for(int j=right; j>=left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            
            //left col
            if(top <= bottom && left <= right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }           
        }
        return result;
    }
}
