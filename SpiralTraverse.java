import java.util.*;

//Time Complexity : O(M*N) -> M is the number of rows and N is the number of columns in the matrix
//Space Complexity : O(M*N) -> M is the number of rows and N is the number of columns in the matrix

//Leetcode problem : https://leetcode.com/problems/spiral-matrix/

public class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0)
            return result;

        int startRow = 0;
        int startCol = 0;

        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //moving left to right 
            for (int i = startCol; i <= endCol; i++) {
                result.add(matrix[startRow][i]);
            }
            startRow++;

            //moving from top to bottom
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;

            if (startRow <= endRow) {
                //moving from right to left
                for (int i = endCol; i >= startCol; i--) {
                    result.add(matrix[endRow][i]);
                }
            }
            endRow--;

            if (startCol <= endCol) {
                //moving from bottom to top
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
            }
            startCol++;
        }
        return result;
    }
}
