package s30.arrays.array1;

// Time Complexity: O(m*n) As we are traversing every element of the matrix
// Space Complexity: O(1)

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int ROW_START = 0;
        int COL_START = 0;
        int COL_END = n-1;
        int ROW_END = m-1;

        List<Integer> res = new ArrayList();
        int rowIndex =0;
        int colIndex =0;


        while(ROW_START <= ROW_END && COL_START <= COL_END){
            //UP, start from j=0 -> colEnd
            while( colIndex <= COL_END){
                res.add(matrix[rowIndex][colIndex]);
                colIndex++;
            }
            ROW_START++;
            colIndex--;
            rowIndex++;


            //Down, start from r=0 -> rowEnd
            while(rowIndex <= ROW_END){
                res.add(matrix[rowIndex][colIndex]);
                rowIndex++;
            }
            COL_END--;
            rowIndex--;
            colIndex--;

            //Left, start from j = COL_end -> colStart
            if(ROW_START <= ROW_END){
                while(colIndex >= COL_START){
                    res.add(matrix[rowIndex][colIndex]);
                    colIndex--;
                }
                ROW_END--;
                colIndex++;
                rowIndex--;
            }

            //UP, start from r = rowEnd -> rowStart

            if(COL_START <= COL_END){
                while(rowIndex >= ROW_START){
                    res.add(matrix[rowIndex][colIndex]);
                    rowIndex--;
                }
                rowIndex++;
                COL_START++;
                colIndex++;
            }

        }

        return res;

    }
    public static void main(String[] args) {

    }
}
