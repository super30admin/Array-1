// Time Complexity : O(m*n) where m = number of rows, n = number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.Arrays;
public class Problem2 {
    
    private static final int UP = 0, DOWN = 1;
    
    public static int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] res = new int[rows*cols];
        int i = 0, j = 0;
        int resultindex = 0;
        int direction = UP;
        while(resultindex < res.length) {
            res[resultindex] = mat[i][j];
            resultindex++;
            if (direction == UP) {
                // check j condition first as we increment j, so take care it doesn't go out of bound
                if (j == cols-1) { // move down
                    i++;
                    direction = DOWN;
                } else if (i == 0) { // move right
                    j++;
                    direction = DOWN;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == rows-1) { // move right
                    j++;
                    direction = UP;
                } else if (j == 0) { // move down
                    i++;
                    direction = UP;
                } else {
                    i++;
                    j--;
                }
            }
            
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = findDiagonalOrder(mat);
        System.out.println(Arrays.toString(ans));
    }
}
