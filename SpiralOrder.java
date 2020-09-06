/*
54. Spiral Matrix - MEDIUM
https://leetcode.com/problems/spiral-matrix/
Did this code successfully run on Leetcode: Yes

Approach: Follow the visual traversal pattern
There are 4 directions - right, bottom, left and top
For right, print all elements from left to right. Now, since the top-right element is already printed,
for the next direction which is bottom, increment top by 1, and print from top to bottom.
For the next direction, which is left, excluding the bottom-right, decrement right by 1, and print from right to left .
For the next direction, which is top, excluding the bottom-left, increment bottom by 1, and print from bottom to top.
After each step, change to next direction
*/

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<Integer>();
        }
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        
        int l, r, t, b, dir = 0;
        l = 0;
        r = colLen - 1;
        t = 0;
        b = rowLen - 1;
        

        // dir: 0-right, 1-bottom, 2-left, 3-right
        List<Integer> result = new ArrayList<>();
        
        while (l <= r && t <= b) {
            if (dir == 0) {
                for (int i = l; i <= r; i++) {
                    result.add(matrix[t][i]);
                }
                t++;
            } else if (dir == 1) {
                for (int i = t; i <= b; i++) {
                    result.add(matrix[i][r]);
                }
                r--;    
            } else if (dir == 2) {
                for (int i = r; i >= l; i--) {
                    result.add(matrix[b][i]);
                }
                b--;
            } else if (dir == 3) {
                for (int i = b; i >= t; i--) {
                    result.add(matrix[i][l]);
                }
                l++;
            }
            dir = (dir+1) % 4;
        }
        return result;
    }
}