
//Time complexity : O(M*N) -> M is the number of rows and N is the number of columns in the matrix
//Space complexity : O(M*N) -> M is the number of rows and N is the number of columns in the matrix

/**
 * Traverse the matrix diagonally, alternating between upward and downward directions.  
 * Maintain row and column indices, adjusting movement based on boundary conditions.  
 * Store elements in a result array while ensuring correct traversal order.
 */

 //Leetcode problem : https://leetcode.com/problems/diagonal-traverse

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {

        boolean up = true; // going up
        int currRow = 0;
        int currCol = 0;

        int rowLength = mat.length;
        int colLength = mat[0].length;
        int[] result = new int[rowLength * colLength];
        int index = 0;

        while (index < rowLength*colLength) {
            if (up) {
                while (currRow > 0 && currCol < colLength-1) {
                    result[index] = mat[currRow][currCol];
                    currRow--;
                    currCol++;
                    index++;
                }
                result[index] = mat[currRow][currCol];
                index++;
                if (currCol < colLength-1) {
                    currCol++;
                } else {
                    currRow++;
                }
                up = false;
            } else {
                while (currRow < rowLength-1 && currCol > 0) {
                    result[index] = mat[currRow][currCol];
                    currRow++;
                    currCol--;
                    index++;
                }
                result[index] = mat[currRow][currCol];
                index++;

                if (currRow == rowLength-1) {
                    currCol++;
                } else {
                    currRow++;
                }
                up = true;
            }
        }
        return result;
    }
}
