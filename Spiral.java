// Time Complexity :O(n)
// Space Complexity :O(1)
import java.util.ArrayList;
import java.util.List;

public class Spiral {

        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            int row_begin = 0;
            int row_end = matrix.length-1;
            int column_begin = 0;
            int column_end = matrix[0].length-1;
            while(row_begin <= row_end && column_begin <= column_end){
                for(int i=column_begin; i<=column_end; i++){
                    res.add(matrix[row_begin][i]);
                }
                row_begin++;
                for(int i=row_begin; i<=row_end; i++){
                    res.add(matrix[i][column_end]);
                }
                column_end--;
                if(row_begin <= row_end){
                    
                     for(int i=column_end; i>=column_begin; i--){
                       res.add(matrix[row_end][i]);
                    }
                    
                    row_end--;   
                }
                if(column_begin <= column_end){
                    
                     for(int i=row_end; i>=row_begin; i--){
                          res.add(matrix[i][column_begin]);
                      }
                    
                    column_begin++;
                }   
            }   
            return res;   
        }
    
}
