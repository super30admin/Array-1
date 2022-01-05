import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TraverseArrayInSpiralOrder {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int m = matrix.length;;
        int n= matrix[0].length;
        int top=0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(left <= right && top <= bottom ){
            //top row
            for(int i = left; i <= right && result.size() < m*n ; i++){
                result.add(matrix[top][i]);
            }
            top++;

            //right column
            for(int i = top; i <= bottom  && result.size() < m*n; i++){
                result.add(matrix[i][right]);
            }
            right--;

            //bottom row
            for(int i = right; i >= left  && result.size() < m*n; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;

            //left column
            for(int i = bottom; i >= top  && result.size() < m*n; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("Spiral traverse of given matrix : " +
                        spiralOrder(new int[][]{
                                {1,2,3},{4,5,6},{7,8,9}
                        }));
    }
}
