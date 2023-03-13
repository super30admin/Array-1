import java.util.List;
import java.util.ArrayList;

// Time Complexity : O(mn); m = matrix.length; n = matrix[0].length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    private boolean inBounds(int x, int boundary) {
        return x >=0 && x < boundary;
    }

    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return new int[] {};
        }

        final String UP = "UP";
        final String DOWN = "DOWN";
        
        // Store directions: right and down.
        int[] upRight = new int[] {-1,1};
        int[] downLeft = new int[] {1,-1};
        
        // Capture number of elements processed
        int count = 0;

        int m = mat.length;
        int n = mat[0].length;

        // Start with "up" direction
        String currDirection = UP;

        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        // Run until we have processed all the 2D array elements
        while(count < m * n) {
            int[] nextDir = currDirection == UP ? upRight : downLeft;

            // While within bounds, fill the ourput array
            while(inBounds(i, m) && inBounds(j, n)) {
                result.add(mat[i][j]);
                count++;

                i += nextDir[0];
                j += nextDir[1];
            }

            // Reset i and j
            i -= nextDir[0];
            j -= nextDir[1];

            // Assign next start point
            if(currDirection == UP) {
                // Check right
                if(inBounds(j+1, n)) {
                    j = j + 1;
                }
                // Check Down 
                else if(inBounds(i+1, m)){
                    i = i + 1;
                } else {
                    break;
                }
            } else {
                // Check Down
                if(inBounds(i+1, m)) {
                    i = i + 1;
                }
                // Check right 
                else if(inBounds(j+1, n)){
                    j = j + 1;
                } else {
                    break;
                }
            }

            // Toggle direction
            currDirection = currDirection == UP ? DOWN : UP;
        }

        return result.stream().mapToInt(y -> y).toArray();
    }
}