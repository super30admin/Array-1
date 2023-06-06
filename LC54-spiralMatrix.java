
// time=  O(m*n) , Space = O(1)
import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;

        List<Integer> res = new ArrayList<>();

        int top =0;
        int bot =row-1;
        int left =0;
        int right =col-1;
        
        while (top<=bot && left <= right) {
            
            // top row, left to right
            for (int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;

            // right col; top to bottom
            for (int i=top;i<=bot; i++){
                res.add(matrix[i][right]);
            }
            right--;

            // bot row, right to left, if top <= bot
            if (top <= bot) {
                for (int i=right;i>=left; i--) {
                    res.add(matrix[bot][i]);
                }
            }
            bot--;

            // left col, bot to top, if top >= bot
            if (left <= right) {
                for (int i=bot;i>=top; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;

        }
        return res;
    }
}