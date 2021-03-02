import java.util.ArrayList;
import java.util.List;
// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// - first traverse left to right on top row
// - traverse from top to bottom on right col
// - traverse right to left on bottom row
// - traverse bottom to top on left col
// - repeat these steps until left <= right and top <= bottom

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;

        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, r = n - 1;
        int top = 0, bottom = m - 1;

        while (top <= bottom && l <= r) {

            for (int j = l; j <= r; j++) {
                ans.add(matrix[top][j]);
            }

            top++;

            if (top <= bottom && l <= r) {
                for (int i = top; i <= bottom; i++) {
                    ans.add(matrix[i][r]);
                }
            }

            r--;

            if (top <= bottom && l <= r) {
                for (int j = r; j >= l; j--) {
                    ans.add(matrix[bottom][j]);
                }
            }
            bottom--;

            if (top <= bottom && l <= r) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][l]);
                }
            }
            l++;
        }
        return ans;
    }

}
