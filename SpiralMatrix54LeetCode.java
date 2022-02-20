//Time Complexity:O(m*n) m,n = row and column of a matrix
//Space Complexity: O(1)
//it runs successfully on leetcode
// I dont face any problems


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54LeetCode {


    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();               //creating the output list
        int m = matrix.length;                                   //row
        int n = matrix[0].length;                               //column

        //created 4 pointers for firstRow, lastRow, firstColumn, lastColumn
        int firstRow = 0;
        int lastRow = m-1;
        int firstColumn = 0;
        int lastColumn = n-1;


        while(firstRow<=lastRow && firstColumn<=lastColumn){            //iterating condition

            //right
            for(int j=firstColumn; j<=lastColumn; j++){             //iterating first row from left to right
                result.add(matrix[firstRow][j]);
            }
            firstRow++;                                         //completing the firstRow and increment the firstRow pointer


            //down
            for(int i = firstRow; i<=lastRow; i++){                 //iterating the last column from top to down
                result.add(matrix[i][lastColumn]);
            }
            lastColumn--;                                      //completing the lastColumn and decrement the lastColumn pointer

            //left
            if(firstRow<=lastRow){                              //check first row pointer is still less than the last row pointer, it's useful when matrix is not square

                for(int j = lastColumn; j>=firstColumn; j--){       //iterating the last row from right to left
                    result.add(matrix[lastRow][j]);
                }
                lastRow--;                                      //decrement the last row as it completes iterating
            }


            //up
            if(firstColumn<=lastColumn){                    //check if firstColumn is still less than the last column, useful when matrix is not square
                for(int i=lastRow; i>=firstRow; i--){       //iterating the first column from down to top
                    result.add(matrix[i][firstColumn]);
                }
                firstColumn++;                              //as we completed first column, increment the first column
            }

        }

        return result;
    }


}
