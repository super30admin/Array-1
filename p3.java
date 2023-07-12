// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Traversing through the matrix in the order shown in the question by considering on spiral at a time. Maintaining four pointers ie left, right, up and down to define the boundaries of the spiral. Adding elements into the list while traversing through the spiral defined by boundaries

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Output list
        List<Integer> result = new ArrayList<>();
        // Left boundary
        int l = 0;
        // Right boundary
        int r = matrix[0].length - 1;
        // Upper boundary
        int u = 0;
        // Lower boundary
        int d = matrix.length - 1;

        while (d >= u && r >= l) {

            // Traverisng through the spiral
            // Going from left to right
            for (int i = l; i <= r; i++) {
                result.add(matrix[u][i]);
            }
            u++;
            // Going from up to down
            for (int i = u; i <= d; i++) {
                result.add(matrix[i][r]);
            }
            r--;
            // Going from right to left
            if (d >= u) {
                for (int i = r; i >= l; i--) {
                    result.add(matrix[d][i]);
                }
                d--;
            }
            // Going from down to up
            if (r >= l) {
                for (int i = d; i >= u; i--) {
                    result.add(matrix[i][l]);
                }
                l++;
            }
        }

        return result;
    }
}