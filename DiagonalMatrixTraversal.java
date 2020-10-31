package S30.Arrays_1;

/*
Time Complexity : O(m + n), m -> # of rows, n -> # of columns
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/

import java.util.ArrayList;
import java.util.List;

public class DiagonalMatrixTraversal {

    public int[] findDiagonalOrder(int[][] matrix) {

        if(matrix == null || matrix.length == 0) return new int[0];

        int R = matrix.length;
        int C = matrix[0].length;
        int[] result = new int[R*C];

        int dir = 1;
        int i = 0;
        int j = 0;
        int idx = 0;

        while(idx < R*C){
            result[idx++] = matrix[i][j];
            if(dir == 1){
                if(j == C-1){
                    i++;
                    dir = -1;
                }else if(i == 0){
                    j++;
                    dir = -1;
                }else{
                    i--;
                    j++;
                }
            }else{

                if(i == R-1){
                    j++;
                    dir = 1;
                }else if(j == 0){
                    i++;
                    dir = 1;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return result;
    }


}
