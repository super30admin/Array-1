import java.util.ArrayList;
import java.util.List;

class Solution {
    /* Time complexity : O(m* n);
    Space complexity : O(1);

    executed on leetcode;
    */ 
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n= matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int left = 0;
        int bottom= m-1;
        int right= n-1;
        int count = m*n;
        while (top <= bottom && left <= right && count > 0){
            if (count > 0){
                for (int j =left; j <= right; j++){
                    count--;
                    result.add(matrix[top][j]);
                }
                top++;
            }
            
            //right
            if (count > 0){
                for (int i = top ; i<= bottom; i++){
                    count--;
                    result.add(matrix[i][right]);
                }
                right --;

            }
            

            //bottom
            if (count > 0){
                for (int j = right; j>=left; j--){
                    count--;
                    result.add(matrix[bottom][j]);
                }
                bottom--;

            }
            

            //left
            if (count > 0){
                for (int i= bottom; i>=top; i--){
                    count--;
                    result.add(matrix[i][left]);
                }
                left ++;

            }
            
        }
        return result;
    }
}