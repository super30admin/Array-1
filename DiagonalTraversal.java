// You set the initial direction as 1 and traverse through the array diagonally. When row and columns goes out of bound, either increment 
// row or column and change the direction

// Time Complexity : O(m * n) where m is the number of rows and n is the number of columns 
// Space Complexity : O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalTraversal {
    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[0];
        int m = matrix.length, n = matrix[0].length;
        int[] res = new int[m * n];

        int r = 0, c = 0, dir = 1;
        int i = 0;

        while (i < m * n) {
            res[i++] = matrix[r][c];
            if (dir == 1) {
                if (c == n - 1) {
                    r++;
                    dir = -1;
                } else if (r == 0) {
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                    dir = 1;
                } else if (c == 0) {
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
            // i++;
        }
        return res;
    }

    public static void main(String[] args) {
        List<int[][]> input = new ArrayList<>();
        Collections.addAll(input, new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, new int[][] {},
                new int[][] { { 1, 2, 3, 4 } }, new int[][] { { 1 }, { 2 }, { 3 } },
                new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } });

        for (int[][] matrix : input) {
            System.out.println(Arrays.toString(findDiagonalOrder(matrix)));
        }
    }
}
