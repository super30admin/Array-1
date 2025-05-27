/*
Intuition : Just traverse the matrix spirally and write dynamic code
time : O(mxn)
Space : O(1)
 */
import java.util.*;

public class SpiralMatrix {

        public static List<Integer> spiralOrder(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            List<Integer> result = new ArrayList<>();
            int top = 0, bottom = m - 1, left = 0, right = n - 1;

            while (left <= right && top <= bottom) {

                //top row
                for (int j = left; j <= right; j++) {
                    result.add(matrix[top][j]);
                }

                top++;

                //right col
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }

                right--;

                if (top <= bottom) {
                    // bottom row
                    for (int j = right; j >= left; j--) {
                        result.add(matrix[bottom][j]);
                    }

                }

                bottom--;

                if (left <= right) {
                    //left col
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                }

                left++;
            }

            return result;
        }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiralOrder(mat);

        for(int i : result){
            System.out.print(" " + i);
        }
    }

}
