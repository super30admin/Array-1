import java.util.ArrayList;
import java.util.List;
//Time Complexity: O(n * m), n -> no of cols, m -> no of rows
//Space Complexity: O(1), output is not considered in the space complexity
//Did this code successfully run on Leetcode : Yes
//Approach: With each spiral, the boundaries of the next spiral shrink inwards, left, right, top and bottom handle that
//the idea is to go from left to right, top to bottom, right to left and bottom to top until the condition (left <= right && top <= bottom) breaks
//if left and right cross each other and right < left, we can run into getting false output if the condition is not added, similarly for top and bottom
public class SpiralMatrix {

    /**
     *
     * @param matrix the matrix
     * @return       the spiral order of elements in the matrix
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        final List<Integer> output = new ArrayList<>();
        int left = 0, right = n - 1, bottom = m - 1, top = 0;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                output.add(matrix[top][i]);
            }
            top++;

            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    output.add(matrix[i][right]);
                }
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    output.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    output.add(matrix[i][left]);
                }
            }
            left++;
        }

        return output;
    }

    public static void main(String[] args) {
        final SpiralMatrix spiralMatrix = new SpiralMatrix();
        System.out.println(spiralMatrix.spiralOrder(new int[][] {
                {1, 2, 3, 4, 17},
                {5, 6, 7, 8, 18},
                {9, 10, 11, 12, 19},
                {13, 14, 15, 16, 20},
                {21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30},
        }));

        System.out.println(spiralMatrix.spiralOrder(new int[][] {
                {1, 2, 3, 4, 17, 31, 32},
                {5, 6, 7, 8, 18, 33, 34},
                {9, 10, 11, 12, 19, 35, 36},
                {13, 14, 15, 16, 20, 37, 38},
                {21, 22, 23, 24, 25, 39, 40},
                {26, 27, 28, 29, 30, 41, 42},
        }));
    }
}
