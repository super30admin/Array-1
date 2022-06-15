// Time Complexity: O(m*n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes
// Three line explanation of solution in plain english: Taking two pointers i & j for traversing the matrix

import java.util.Arrays;

public class findDiagonalOrder {

    public static int[] getDiagonalOrder(int[][] mat) {
        int goingUp = 1;
        int r = mat.length; // Row
        int c = mat[0].length; // Column
        int[] result = new int[(r * c)];

        int idx = 0;
        int i = 0;
        int j = 0;

        while (i < r && j < c) {
            result[idx] = mat[i][j];
            idx += 1;
            if (idx == r * c) {
                return result;
            }

            // Going Down
            if (goingUp != 1) {
                if (i == r - 1) {
                    j++;
                    goingUp = 1;
                } else if (j == 0) {
                    i++;
                    goingUp = 1;
                } else {
                    i += 1;
                    j -= 1;
                    goingUp = 0;
                }
            } else {
                // Going UP
                if (j == c - 1) {
                    i++;
                    goingUp = 0;
                } else if (i == 0) {
                    j++;
                    goingUp = 0;
                } else {
                    i -= 1;
                    j += 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(Arrays.toString(getDiagonalOrder(mat)));
    }
}
