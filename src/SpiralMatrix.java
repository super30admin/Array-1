import java.util.ArrayList;
import java.util.List;
// Time Complexity :o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode :Yes
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int top =0; 
        int left =0;
        int bottom = n-1;
        int right = m-1;
        
        ArrayList<Integer> list = new ArrayList<>();

        while ( top<=bottom && left<=right){

            for(int i=left; i<right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<bottom; i++){
                list.add(matrix[i][top]);
            }
            right--;

            if( top <= bottom){
                for(int i=right; i>left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<= right){
                for(int i=bottom; i>top; i--){
                    list.add(matrix[bottom][i]);
                }
                left++;
            }

        }
        
        
        return list;
        
    }
    
}
