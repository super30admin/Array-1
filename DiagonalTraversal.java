// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {

    public int minCost(int[][] costs) {
        for (int n = costs.length - 2; n >= 0; n--) {
            // Total cost of painting the nth house red.
            costs[n][0] += Math.min(costs[n + 1][1], costs[n + 1][2]);
            // Total cost of painting the nth house green.
            costs[n][1] += Math.min(costs[n + 1][0], costs[n + 1][2]);
            // Total cost of painting the nth house blue.
            costs[n][2] += Math.min(costs[n + 1][0], costs[n + 1][1]);
        }

        if (costs.length == 0) return 0;

        return Math.min(Math.min(costs[0][0], costs[0][1]), costs[0][2]);
    }
}

 7 changes: 0 additions & 7 deletions7  
Sample.java


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int idx = 0;

        if (mat == null) return result;
        int i = 0; int j = 0;       //matrix location
        boolean dir = true;
        while (idx < m * n) {    
            result[idx] = mat[i][j];    //initialising index with 0,0 positions
            idx ++;
            //find new location of i, j
            if (dir) {
                //up
                if (j == n - 1) {
                    i ++;
                    dir = false;
                } else if (i == 0) {    //this is second condition to avoid out of bounds error at top right corner
                    j ++;
                    dir = false;
                } else {
                    i --;
                    j ++;
                }
            } else {
                //moving down
                if (i == m - 1) {
                    j ++;
                    dir = true;
                } else if (j == 0) {    //same reason why this is the second condition at bottom left corner
                    i ++;
                    dir = true;
                } else {
                    i ++; 
                    j --;
                }
            }
        }
        return result;
    }
}