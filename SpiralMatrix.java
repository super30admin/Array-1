// Time Complexity -O(m*n) where m is number of columns in matrix and n is number of rows in the matrix
// Space Complexity - O(1)

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix==null || matrix.length == 0) return new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left =0, right = n-1;
        int top =0, bottom = m-1;
        List<Integer> result = new ArrayList<>();

        while(top<=bottom && left<=right) {

            // top wall
            for (int j=left; j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;

            // base variable changed so check condition again
            if(top<=bottom && left<=right){
                // right wall
                for (int i=top; i<=bottom; i++){
                    result.add(matrix[i][right]);
                }
            }
            right--;

            // base variable changed so check condition again
            if(top<=bottom && left<=right){
                //bottom wall
                for (int k=right; k>=left; k--){
                    result.add(matrix[bottom][k]);
                }
            }
            bottom--;

            // base variable changed so check condition again
            if(top<=bottom && left<=right){
                //left wall
                for(int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}
