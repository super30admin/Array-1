package Day10_Array1;

import java.util.ArrayList;
import java.util.List;

//Time Complexity : O(n) where n is the number of elements of matrix 
//Space Complexity : O(n) where n is the length of res array 
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this : no

public class SpiralOrder {
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0)
            return res;
        // initializing first and last element of row and column
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        // going around and picking elements in the spiral end to end
        while (r1 <= r2 && c1 <= c2) {
        	// iterating row from left to right
            for (int c = c1; c <= c2; c++) res.add(matrix[r1][c]);
            // iterating column from top to bottom
            for (int r = r1 + 1; r <= r2; r++) res.add(matrix[r][c2]);
            // iterating the bottom row right to left, leaving last element from the row
            // iterating column from bottom to top, leaving top element of that column
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) res.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) res.add(matrix[r][c1]);
            }
            // compacting the spiral
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return res;
    }
}
