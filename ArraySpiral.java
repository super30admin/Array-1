import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * Using top, bottom, left and right pointers to keep track of current spiral and add elements to the response
 */
public class ArraySpiral {

    public static List<Integer> arraySpiralTraversal(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                answer.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                answer.add(matrix[i][right]);
            }
            right--;

            // Avoid adding duplicate elements in last spiral
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    answer.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Avoid adding duplicate elements in last spiral
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    answer.add(matrix[i][left]);
                }
                left++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(arraySpiralTraversal(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(arraySpiralTraversal(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }
}
