package Array1;

import java.util.ArrayList;
import java.util.List;

public class question28_spiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<>();

        if(matrix == null || matrix.length == 0) return result;

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        /*
            Base condition was breaching that is why we are checking that condition everywhere in the loop.
        */
        while(left <= right && top <= bottom) {
            //top row
            for(int j = left ; j <= right ; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            //right column
            for(int i = top ; i <= bottom ; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) {
                //bottom row
                for(int j = right ; j >= left ; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if(left <= right) {
                //left column
                for(int i = bottom ; i >= top ; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}