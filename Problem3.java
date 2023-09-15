import java.util.ArrayList;
import java.util.List;

public class Problem3 {


        public List<Integer> spiralOrder(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int top = 0,bottom = m-1;
            int left = 0,right = n-1;
            List<Integer> res = new ArrayList<>();
            int ind=0;
            while(top <= bottom && left <= right){

                for(int i = left ;i<=right;i++){
                    res.add(matrix[top][i]);
                }
                top++;

                for(int i = top;i<= bottom ;i++){
                    res.add(matrix[i][right]);
                }
                right--;

                if(top <= bottom ){
                    for(int i = right;i>=left;i--){
                        res.add(matrix[bottom][i]);

                    }
                    bottom--;
                }

                if(left <= right){
                    for(int i= bottom ;i>= top ;i--){
                        res.add(matrix[i][left]);

                    }
                    left++;
                }

            }
            return res;

        }

}
