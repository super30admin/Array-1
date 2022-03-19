import java.util.*;
// Time Complexity :O(n) n is the number of elements in the matrix.
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english : check for moving boundaries using four pointers and iterate through the four sides with four for loops.

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();
        if (matrix == null || matrix.length == 0)
            return list;
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = n - 1, t = 0, b = m - 1;
        while (l <= r & t <= b) {
            // top
            for (int j = l; j <= r; j++) {
                list.add(matrix[t][j]);
            }
            t++;
            // right
            for (int i = t; i <= b; i++) {
                list.add(matrix[i][r]);
            }
            r--;
            // bottom
            if (t <= b) {
                for (int j = r; j >= l; j--) {
                    list.add(matrix[b][j]);
                }
                b--;
            }
            // left
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    list.add(matrix[i][l]);
                }
                l++;

            }
        }
        return list;
    }

}
