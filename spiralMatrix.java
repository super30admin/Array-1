import java.util.ArrayList;

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes.
// Three line explanation of solution in plain english
/**
 * 4 pointer solution using all corner points to start.
 * Each point will scale down the matrix and print in a 4 point manner
 * until the entire matrix is returned in a sprial way. Terminates when pointers left/right, top/bottom pointers cross
 */


public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int rowLen = matrix.length; 
        int colLen = matrix[0].length;
        int top, bottom, left, right;
        top = 0;
        bottom = rowLen - 1;
        left  = 0;
        right = colLen - 1;

        while(left <= right && top <= bottom) {
            //top going down
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            //right going left
            if(left <= right && top <= bottom){
                for(int i = top; i <= bottom; i++){
                    result.add(matrix[i][right]);
                }
                right --;
            }
            
            //bottom going up
            if(left <= right && top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //left going right
            if(left <= right && top <= bottom){
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
