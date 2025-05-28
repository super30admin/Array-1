/*
 * Question:
 * Given a 2D matrix of size m x n, return all elements in diagonal order (zigzag pattern).
 * Diagonal traversal moves up-right (↗) and then down-left (↙) alternately.
 *
 * Approach:
 * → Start from top-left (0,0) and move diagonally.
 * → Use a boolean flag `Up` to track direction:
 *    - If Up is true: go up-right (↗)
 *      → If at last column: move down, change direction
 *      → If at first row: move right, change direction
 *    - If Up is false: go down-left (↙)
 *      → If at last row: move right, change direction
 *      → If at first column: move down, change direction
 * → Repeat until all elements are covered.
 *
 * Example Input: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 * Output: [1,2,4,7,5,3,6,8,9]
 *
 * Time Complexity: O(m * n) — each element is visited once
 * Space Complexity: O(1) extra — except the output array
 */

import java.util.Arrays;

public class Problem_2 {
    static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0;
        int c = 0;
        int i = 0;
        boolean Up = true;
        while ((r < m) && (c < n) && (i < m * n)) {
            result[i] = mat[r][c];
            if (Up == true) {
                if (c == n - 1) {
                    Up = false;
                    r++;
                } else if (r == 0) {
                    Up = false;
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    Up = true;
                    c++;
                } else if (c == 0) {
                    Up = true;
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] mat2 = { { 1, 2 }, { 3, 4 } };
        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
        System.out.println(Arrays.toString(findDiagonalOrder(mat2)));
    }

}
