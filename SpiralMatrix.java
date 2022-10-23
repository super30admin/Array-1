package S30_Codes.Array_1;

// Time Complexit : O(m*n)
// Space Complexity : O(1)
// Array-1

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int m = matrix.length, n = matrix[0].length;
        int startRow = 0, endRow = m-1;
        int startCol = 0, endCol = n-1;

        while(startRow <= endRow && startCol <= endCol){

            // RIGHT
            for(int j = startCol; j <= endCol; j++){
                result.add(matrix[startRow][j]);
            }
            startRow++;

            // DOWN
            for(int i = startRow; i <= endRow; i++){
                result.add(matrix[i][endCol]);
            }
            endCol--;

            // LEFT
            if(startRow <= endRow){
                for(int j = endCol; j >= startCol; j--){
                    result.add(matrix[endRow][j]);
                }
                endRow--;
            }

            //UP
            if(startCol <= endCol){
                for(int i = endRow; i >= startRow; i--){
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }

        return result;
    }
}