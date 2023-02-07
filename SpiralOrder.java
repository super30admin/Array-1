// TC = O(m*n) m = no of rows, n = no of columns
// SC = O(1) , since no auxiliary space was used

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0) return new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int top=0;
        int bottom=rows-1;
        int left=0;
        int right=cols-1;
        while(top<=bottom && left<=right){
            if (top <= bottom) {
                for(int j=left;j<=right;j++){
                    res.add(matrix[top][j]);
                }
            }
            top++;

            if(left<=right){
                for(int i=top;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
            }
            right--;

            if (top <= bottom) {
                for(int j=right;j>=left;j--){
                    res.add(matrix[bottom][j]);
                }
            }
            bottom--;

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
            }
            left++;

        }
        return res;

    }

    public static void main(String[] args) {
        List<Integer> res = SpiralOrder.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
        System.out.println(res);
    }
}
