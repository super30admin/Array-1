import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li= new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom = m-1;
        int left=0;
        int right=n-1;
        while(top<=bottom && left<=right){
            //top row iteration
            for(int j=left; j<=right; j++){
                li.add(matrix[top][j]);
            }
            //shrinking the top
            top++;
            if(top<=bottom){
            //right col iteration
            for(int i=top; i<=bottom; i++){
                li.add(matrix[i][right]);
            }
            }
            //shrinking right
            right--;
            if(top<=bottom && left<=right){
            //bottom row iteration
            for(int j=right; j>=left; j--){
                li.add(matrix[bottom][j]);
            }
            }
            //shrinking bottom
            bottom--;
            if(top<=bottom && left<=right){
            //left col iteration
            for(int i=bottom; i>=top; i--){
                li.add(matrix[i][left]);
            }
            }
            //shrinking left
            left++;
        }
        return li;

    }
}