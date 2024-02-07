import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n =  matrix[0].length;
        List<Integer> res = new ArrayList<>();
        //top and bottom pointers
        int top=0; int bottom = m-1;
        //left and right pointers
        int left=0; int right=n-1;

        //logic
        while(left<=right && top<=bottom){
            //top row
            for(int j=left; j<=right; j++){
                res.add(matrix[top][j]);
            }
            top++;
            //right col

            for(int i=top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;


            //bottom row
            if(top<=bottom){
                for(int j=right; j>=left;j--){
                    res.add(matrix[bottom][j]);
                }
                bottom--;

            }


            //left col
            if(left<=right ){
                for(int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;

            }



        }
        return res;
    }
}
