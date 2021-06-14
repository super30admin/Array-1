import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Vishal Puri
 * // Time Complexity : O(n^2)
 * // Space Complexity : O(min(m,n))
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */


public class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[]{};
        //dir=1-up and dir=-1 - down
        int dir = 1, r = 0, c = 0;
        int m = matrix.length, n = matrix[0].length;
        int[] out = new int[m * n];
        for (int i = 0; i < m * n; i++) {
            out[i] = matrix[r][c];
            if (dir == 1) {
                //c==n-1
                if (c == n - 1) {
                    dir = -1;
                    r++;
                }
                //r==0
                else if (r == 0) {
                    dir = -1;
                    c++;
                }
                //r-- c++
                else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    dir = 1;
                    c++;
                } else if (c == 0) {
                    dir = 1;
                    r++;
                } else {
                    c--;
                    r++;
                }
            }
        }
        return out;
    }
}
