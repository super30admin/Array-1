// Time Complexity : O(m * n) where m is the number of rows, and n is the number of columns
// Space Complexity : O(1) 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        int m = matrix.length, n = matrix[0].length;
        int u = 0, d = m - 1, l = 0, r = n - 1;

        while (u <= d && l <= r) {
            for (int col = l; col <= r; col++) {
                res.add(matrix[u][col]);
            }
            if (++u > d)
                break;

            for (int row = u; row <= d; row++) {
                res.add(matrix[row][r]);
            }
            if (--r < l)
                break;

            for (int col = r; col >= l; col--) {
                res.add(matrix[d][col]);
            }
            if (--d < u)
                break;

            for (int row = d; row <= u; row++) {
                res.add(matrix[row][l]);
            }
            if (++l > r)
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        List<int[][]> input = new ArrayList<>();
        Collections.addAll(input, new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
                new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } });

        for (int[][] matrix : input) {
            System.out.println(spiralOrder(matrix).toString());
        }
    }
}
