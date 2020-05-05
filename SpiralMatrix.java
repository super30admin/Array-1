package com.ds.rani.array;

import java.util.ArrayList;
import java.util.List;

/**
 *Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * Example 1:
 * Input:
 * [
 *
 * [ 1, 2, 3 ],
 *
 * [ 4, 5, 6 ],
 *
 * [ 7, 8, 9 ]
 *
 * ] Output: [1,2,3,6,9,8,7,4,5]
 */

//Approach:keep track of top row,bottom row,left column right column and print top row then right column
// then bottom row then left column
public class SpiralMatrix {
    /**
     * Print matrix in spiral order
     *
     * @param matrix 2D array
     * @return the list of elements trveresd in spiral order
     */

    //Time complexity:o(rows*columns)
    //space complexity;o(rows*columns) which is number of elements in the matrix, if I consider output space
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        //for empty matrix
        if (matrix.length == 0)
            return result;

        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int top = 0;
        int left = 0;
        int dir = 0;


        while (top <= bottom && left <= right) {
            //Print top row
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    result.add( matrix[top][i] );
                    System.out.print( matrix[top][i] + "\t" );
                }
                top++;

            }
            //Print right column
            if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    result.add( matrix[i][right] );
                }
                right--;

            }

            //Print bottom row
            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    result.add( matrix[bottom][i] );
                }
                bottom--;

            }
            // print left column
            if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    result.add( matrix[i][left] );
                }
                left++;

            }
            dir = (dir + 1) % 4;
        }
        return result;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println( SpiralMatrix.spiralOrder( matrix ) );
    }
}
