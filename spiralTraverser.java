import java.util.ArrayList;
import java.util.List;

/*
Time Complexity: O(N*M)
Space Complexity: O(1)
 */
public class SpiralOrderTraverse {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = 0;
        int cols = 0;
        int rowe = matrix.length-1;
        int cole = matrix[0].length-1;

        while(rows<=rowe && cols<=cole){

            for(int i = cols; i<=cole; i++){
                result.add(matrix[rows][i]);
            }

            for(int i = rows+1; i<=rowe; i++){
                result.add(matrix[i][cole]);
            }

            if(rows<rowe && cols<cole){
                for(int i = cole-1; i>cols; i--){
                    result.add(matrix[rowe][i]);
                }
                for(int i = rowe; i>rows; i--){
                    result.add(matrix[i][cols]);
                }
            }

            rows++;
            rowe--;
            cols++;
            cole--;
        }
        return result;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print("Output Spiral matrix: "+spiralOrder(matrix));
    }
}