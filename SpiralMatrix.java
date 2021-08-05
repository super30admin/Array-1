
//https://leetcode.com/problems/spiral-matrix/
/*
Time: O(m*n) where m=rows and n=columns
Space: O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();

        if (matrix == null || matrix.length == 0) {
            return res;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            // Go right
            for (int j = colBegin; j <= colEnd; j++)
                res.add(matrix[rowBegin][j]);
            rowBegin++;

            // Go Down
            for (int i = rowBegin; i <= rowEnd; i++)
                res.add(matrix[i][colEnd]);
            colEnd--;

            // Go left
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--)
                    res.add(matrix[rowEnd][j]);
                rowEnd--;
            }

            // Go Up
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--)
                    res.add(matrix[i][colBegin]);
                colBegin++;
            }

        }
        return res;
    }

}
