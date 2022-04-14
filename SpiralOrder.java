import java.util.ArrayList;
import java.util.List;

/**
 * Time complexity is O(m*n)
 * Space complexity is O(1)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 */
public class SpiralOrder {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> result = spiralOrder(mat);
        System.out.println("result : " + result);

        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result1 = spiralOrder(mat1);
        System.out.println("result : " + result1);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        //base case
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        List<Integer> list = new ArrayList<>();

        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
