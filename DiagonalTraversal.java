// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We use a flag variable to determine the direction of traversal, moving diagonally upwards or downwards depending on the flag value, and updates the indices i and j accordingly. The traversal continues until all elements of input matrix have been added to the ans array.

// Your code here along with comments explaining your approach

import java.util.Arrays;

public class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];

        int idx = 0;
        boolean flag = true;
        int i = 0, j = 0;

        while (idx < ans.length) {
            ans[idx] = mat[i][j];
            idx++;

            if (flag) {
                if (i == 0 && j != n - 1) { // at the topmost row
                    j++;
                    flag = false;
                } else if (j == n - 1) { // at the rightmost column
                    i++;
                    flag = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (j == 0 && i != m - 1) {
                    i++;
                    flag = true;
                } else if (i == m - 1) {
                    j++;
                    flag = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] input = {
                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        };
        DiagonalTraversal obj = new DiagonalTraversal();
        System.out.println(" Diagonal Traversal : " + Arrays.toString(obj.findDiagonalOrder(input)));
    }
}
