// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// set direction 1 as updwards and 0 as downwards
// change direction when you reach boundaries of matrices


// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];
        int itr = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] retArr = new int[m * n];
        int dir = 1;
        int i = 0;
        int j = 0;
        while (itr < retArr.length) {
            retArr[itr++] = matrix[i][j];
            if (dir == 1) {
                if (j == n - 1) {
                    dir--;		//change direction when you reach right boundary
                    i++;
                } else if (i == 0) {
                    dir--;		//change direction when you reach upper boundary
                    j++;
                } else {
                    i--;
                    j++;		//traverse upwards
                }
            } else {
                if (i == m - 1) {
                    dir++;		//change direction when you reach bottom boundary
                    j++;
                } else if (j == 0) {
                    dir++;		//change direction when you reach vertical boundary
                    i++;
                } else {
                    i++;
                    j--;		//traverse downwards
                }
            }
        }
        return retArr;
    }
}
