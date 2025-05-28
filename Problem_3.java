/*
 * Question:
 * Given an m x n 2D matrix, return all elements of the matrix in spiral order.
 *
 * Approach:
 * → Use four pointers: top, bottom, left, right to define the current boundary.
 * → Traverse:
 *    1. From left to right along the top row
 *    2. From top to bottom along the right column
 *    3. From right to left along the bottom row (only if top <= bottom)
 *    4. From bottom to top along the left column (only if left <= right)
 * → Shrink the boundaries after each pass to move inward layer by layer.
 * → Continue until all elements are added to result array.
 *
 * Example Input: [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 *
 * Time Complexity: O(m * n) — each element is visited exactly once.
 * Space Complexity: O(1) — excluding the result array.
 */

import java.util.Arrays;

public class Problem_3 {

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] mat2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.println(Arrays.toString(spiralOrder(mat)));
        System.out.println(Arrays.toString(spiralOrder(mat2)));
    }

    static int[] spiralOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        int[] result = new int[m * n];
        int idx = 0;
        while ((top <= bottom) && (left <= right) && (idx < m * n)) {
            for (int j = left; j <= right; j++) {
                result[idx++] = mat[top][j];
            }
            top++;
            for (int k = top; k <= bottom; k++) {
                result[idx++] = mat[k][right];
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[idx++] = mat[bottom][i];
                }
                bottom--;
            }
            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    result[idx++] = mat[l][left];
                }
                left++;
            }
        }
        return result;

    }
}
