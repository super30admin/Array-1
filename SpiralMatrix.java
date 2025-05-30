
import java.util.*;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        if (matrix.length == 0) {
            return result;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int col = colBegin; col <= colEnd; col++) {
                result.add(matrix[rowBegin][col]);
            }
            rowBegin++;

            for (int row = rowBegin; row <= rowEnd; row++) {
                result.add(matrix[row][colEnd]);
            }
            colEnd--;

            for (int col = colEnd; rowBegin <= rowEnd && col >= colBegin; col--) {
                result.add(matrix[rowEnd][col]);
            }
            rowEnd--;

            for (int row = rowEnd; colBegin <= colEnd && row >= rowBegin; row--) {
                result.add(matrix[row][colBegin]);
            }
            colBegin++;
        }

        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix sol = new SpiralMatrix();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> spiral = sol.spiralOrder(matrix);
        System.out.println("Spiral Order: " + spiral); // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
