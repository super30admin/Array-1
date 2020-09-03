// Time Complexity : O(N * M) N = rows, M = columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//1. Keep a track of four pointers representing each boundary, after traversing and adding
//to array one of 4 side which constitute a spiral traversal, shrink the boundary.
//repeat the same until the boundaries haven't crossed each other.
// Your code here along with comments explaining your approach
import java.util.*;

class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        if (matrix.length == 0 || matrix == null)
            return list;
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, right = m - 1, top = 0, bottom = n - 1;

        while (left <= right && top <= bottom) {

            // top
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            // right
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);

            }
            right--;

            // bottom
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;

            // left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }

        return list;

    }

    public static void main(String args[]) {
        SpiralMatrix obj = new SpiralMatrix();
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(obj.spiralOrder(matrix));

    }
}