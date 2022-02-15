// Time Complexity : O(n); since we are iterating all the elements
// Space Complexity : O(1); using array list to return; not using additional to copy
// Did this code successfully run on Leetcode : Yes (https://leetcode.com/submissions/detail/642195471/)
// Any problem you faced while coding this : No
// My Notes : Think of it like a rectangular box; increment the upper_bound and decrement the lower_bound. If found on same line then ignore
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row_len = matrix.length - 1;
        int col_len = matrix[0].length - 1;

        int[] left_bound = { 0, 0 };
        int[] right_bound = { row_len, col_len };
        // System.out.println(" Bounds : left "+left_bound[0]+","+left_bound[1] +"
        // bot_right "+right_bound[0]+","+right_bound[1] +" matrix_dims :
        // "+row_len+","+col_len);
        boolean isSameLine = (left_bound[1] == right_bound[1]) || (left_bound[0] == right_bound[0]);
        boolean isDifferBy1 = ((right_bound[1] - left_bound[1] == 1) && (right_bound[0] - left_bound[0] == 1));
        boolean isPassLeftBoundsRight = (left_bound[1] > right_bound[1]) || (left_bound[0] > right_bound[0]);

        // int i=0;j=0;

        while (!isPassLeftBoundsRight) {
            // System.out.println(" Hey bounds : left "+left_bound[0]+","+left_bound[1] +"
            // bot_right "+right_bound[0]+","+right_bound[1] +" matrix_dims :
            // "+row_len+","+col_len);
            // Move Right
            for (int j = left_bound[0]; j <= right_bound[1]; j++) {
                // System.out.println(" R "+matrix[left_bound[0]][j]);
                result.add(matrix[left_bound[0]][j]);

            }

            // Move Down
            for (int j = left_bound[0] + 1; j <= right_bound[0]; j++) {
                // System.out.println(" D "+matrix[j][right_bound[1]]);
                result.add(matrix[j][right_bound[1]]);
            }

            // If on same line then skip; just Right and Down are enough
            if (!isSameLine) {
                // Move Left
                for (int j = right_bound[1] - 1; j >= left_bound[1]; j--) {
                    // System.out.println(" L "+matrix[right_bound[0]][j]);
                    result.add(matrix[right_bound[0]][j]);
                }
                // Move Up
                for (int j = right_bound[0] - 1; j > left_bound[1]; j--) {
                    // System.out.println(" U "+matrix[j][left_bound[0]]);
                    result.add(matrix[j][left_bound[0]]);

                }
            }
            // Increment the upper bound
            left_bound[0]++;
            left_bound[1]++;
            // Decrement the lower bound
            right_bound[0]--;
            right_bound[1]--;
            // check if they are on same line to skip repetitve moving left or up
            isSameLine = (left_bound[1] == right_bound[1]) || (left_bound[0] == right_bound[0]);
            // check the bounds have surpassed to break the loop
            isPassLeftBoundsRight = (left_bound[1] > right_bound[1]) || (left_bound[0] > right_bound[0]);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
