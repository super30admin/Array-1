// Time Complexity : O(m * n)
// Space Complexity : [Not using any extra space] only pointers
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
/*
 * took 4 pointers for four sides left(l), right(r), top(t), bottom(b)
 * Started from left to right and added values in result then reduced the ceiling height by doing t--
 * then top to bottom and shifted the right inside by one, 
 * then right to left and shifted the base up by one (Added additonal check for left not crossed right)
 * then finally bottom to top and shifted the left wall to right by one (Added additonal check for top not crossed bottom)
 * Kept doing this till left had not crossed right and top has not below bottom   
*/

// Your code here along with comments explaining your approach


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            List<Integer> result = new ArrayList<>();

            int l = 0, r = n - 1, t = 0, b = m - 1;

            while (l <= r && t <= b) {

                // left - right
                for (int o = l; o <= r; o++) {
                    result.add(matrix[t][o]);
                }

                t++;
                // top - bottom
                for (int o = t; o <= b; o++) {
                    result.add(matrix[o][r]);
                }

                r--;
                // right -> left
                if (t <= b) {
                    for (int o = r; o >= l; o--) {
                        result.add(matrix[b][o]);
                    }
                    b--;
                }

                if (l <= r) {
                    // bottom -> top
                    for (int o = b; o >= t; o--) {
                        result.add(matrix[o][l]);
                    }
                    l++;
                }
            }

            return result;

        }
    }
}
