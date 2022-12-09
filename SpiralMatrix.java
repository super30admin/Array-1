// Time Complexity : O(mn)
// Space Complexity :O(mn)

/*
 * here we are keeping track of all four sides and keep on decreasing 
 * the values aftereach iteration along with checking the base condition after
 * one traversal.
 */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(top <= bottom && right >= left){
            for(int i = left; i <= right; i++){
                arr.add(matrix[top][i]); 
            }
            top++;
            if(top <= bottom && right >= left){
                for(int i = top; i <= bottom; i++){
                    arr.add(matrix[i][right]);
                }
                right--;
            }
            if(top <= bottom && right >= left){
                for(int i = right; i >= left; i--){
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(top <= bottom && right >= left){
                for(int i = bottom; i >= top; i--){
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}
