
// Time Complexity : O(m*n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : Initially at first element the traversal starts from upwards. During upwards direction traversal, the boundary is top and right. When top boundary
// is hit we change the direction and start from next j. When right boundary is hit, we change the direction and start from next i. This is vice-versa in case of
// downwards traversal.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i = 0;
        int j = 0;
        boolean dir = true; //initially we start upwards
        int[] res = new int[m * n];
        for (int index = 0; index < m * n; index++) {
            res[index] = mat[i][j];
            //upwards direction checks
            if (dir) {
                if (i == 0 && j != n - 1) {//checking if hit the boundary and not the corner element
                    dir = false; //change direction
                    j++;
                } else if (j == n - 1) { //corner element condition
                    dir = false;//change direction
                    i++;
                } else {
                    i--;
                    j++;
                }
            } else{ //downwards direction checks
                if (j == 0 && i != m - 1) {//checking if hit the boundary and not the corner element
                    dir = true;//change direction
                    i++;
                } else if (i == m - 1) { //corner element condition
                    dir = true;//change direction
                    j++;
                } else {
                    j--;
                    i++;
                }
            }
        }
        return res;

    }
}