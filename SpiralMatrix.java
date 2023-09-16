import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        if(matrix == null || matrix.length ==0){
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while(top <= bottom && left <= right){

            //move from left to right
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
                System.out.println(matrix[top][i]);
            }
            top++;

            //move from top to bottom
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
                System.out.println(matrix[i][right]);
            }
            right --;

            //move from right to left
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                    System.out.println(matrix[bottom][i]);
                }
                bottom --;
            }

            //move from bottom to top
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left ++;
            }
        }


        return list;
        
    }
}
