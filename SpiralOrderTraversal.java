// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// This code uses four variables top, down, left, and right to track the boundaries of the input matrix. It iterates through the matrix in a spiral pattern, adding each element to the ans list, and adjusts the boundary variables accordingly to move inward. The traversal continues until all elements of the matrix have been added to the ans list.
// Your code here along with comments explaining your approach

import java.util.List;
import java.util.ArrayList;

public class SpiralOrderTraversal {
    public List<Integer> spiralOrderTraversal(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int down = m - 1;
        int left = 0;
        int right = n - 1;

        List<Integer> ans = new ArrayList<>();

        while (top <= down && left <= right) {

            for (int j = left; j <= right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            // if(left<=right && top<=down){ // // Already checked in base case and we did
            // not chnage left/right till now, and for is checking top & bottom
            for (int i = top; i <= down; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            // }

            if (top <= down) {
                for (int j = right; j >= left; j--) {
                    ans.add(matrix[down][j]);
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        };
        SpiralOrderTraversal obj = new SpiralOrderTraversal();
        System.out.println("Spiral Order Traversal: " + obj.spiralOrderTraversal(arr));

    }
}
