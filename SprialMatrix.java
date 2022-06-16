import java.util.ArrayList;
import java.util.List;

// Time Complexity: O(m*n)
// Space Complexity: O(1)

public class SprialMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = m-1;

        while(left <= right && top <= bottom){
            for(int j=left; j<=right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            for(int i=top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int j=right; j>=left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
    }
}
