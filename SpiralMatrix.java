// Time Complexity : O(M*N)
// Space Complexity : O(1), only using the result array
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// We can keep 4 pointers top, bottom, left and right pointing top row, bottom row, first column and last column
// respectively. For copy the elements from top side, we can have pointer that increments from left to right. Since
// that row is done, we can increment the top pointer to next row. Then to copy the elements on left side, we can
// increment a pointer from top to bottom and decrement right pointer. Similarly we can copy elements from matrix to
// result array using left and bottom pinter as well. We stop as soon as any pair of pointers cross each other like
// left pinter becomes equal to or greater than right.

// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int row = matrix.length;
        if (row == 0) return result;
        int col = matrix[0].length;
        if (col == 0) return result;
        int left = 0, top = 0, right = col - 1, down = row - 1;

        while (isValidBound(left, right) && isValidBound(top, down)) {
            /*Adding all elements from the top side*/
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            if (!isValidBound(top, down)) break;

            /*Adding all elements from the right side*/
            for (int i = top; i <= down; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (!isValidBound(left, right)) break;

            /*Adding all elements from the bottom side*/
            for (int i = right; i >= left; i--) {
                result.add(matrix[down][i]);
            }
            down--;
            if (!isValidBound(top, down)) break;

            /*Adding all elements from the left side*/
            for (int i = down; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
            if (!isValidBound(left, right)) break;
        }

        return result;
    }

    private boolean isValidBound(int start, int end) {
        return start >= 0 && start <= end;
    }
}
