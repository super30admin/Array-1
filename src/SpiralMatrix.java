/*
Problem - Spiral , return array of elements in Spral order
Approach - We use four boundaries: top, bottom, left, right to keep track of the spiral path.
•At each step, we traverse right, down, left, then up while shrinking the boundaries.
•We stop when the boundaries cross each other.

Time Complexity - O(m*n)
Space Complexity - O(1)
 */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;
        while (left <= right && top <= bottom) {
            // traversing left to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            // traversing top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            // check if bottom is crossing top as top got mutated above and then traverse right to left
            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // check if right is crossing left as left got mutated above and then traverse bottom to top
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[left][i]);
                }
                left++;
            }
        } // continue until the while check fails
        return res;
    }
    public static void main(String[] args) {
        SpiralMatrix sp = new SpiralMatrix();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = sp.spiralOrder(mat);
        System.out.println(res);
        int[][] mat2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> res2 = sp.spiralOrder(mat2);
        System.out.println(res2);
    }
}
