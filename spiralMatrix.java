
// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes in last while loop traverse I am getting extra element in the result

import java.util.*;

class Main {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        // set boundaries
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        // here I am running while loop until my list filled with all the elements in
        // the matrix.
        while (left <= right && top <= bottom) {
            // first pass left to rigth
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            // increase top boundary by one
            top++;

            // second pass top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            // decrease right boundary by one
            right--;

            // in the last loop of while this for loop will work so we have to make sure
            // that there is no traversal from right to left
            if (top <= bottom) {
                // third pass right to left
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
            }
            // decrease bottom boundary by one
            bottom--;

            // in the last loop of while this for loop will work so we have to make sure
            // that there is no traversal from bottom to top
            if (left <= right) {
                // fourth pass bottom to top
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }

            // increase left pointer by one
            left++;
        }

        // return result
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("spiral matrix is : " + spiralOrder(matrix));
    }
}