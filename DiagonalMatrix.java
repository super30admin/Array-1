// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yesa
// Three line explanation of solution in plain english
// We start by going up and handle the edge scenarios (breaching top row; right col or both) 
// and switch the direction; do the same for going down. Stop when all elements are traversed
// Your code here along with comments explaining your approach
class DiagonalMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] res = new int[rows * cols];
        int i = 0;
        int j = 0;
        // true means up; false means down
        boolean direction = true;
        for (int counter = 0; counter < res.length; counter++) {
            res[counter] = mat[i][j];
            // up scenarios
            if (direction) {
                if (j == cols - 1) {
                    i++; // breaching top right or right most col
                    direction = false;
                } else if (i == 0) {
                    j++; // breaching from top
                    direction = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                // down scenarios
                if (i == rows - 1) {
                    j++; // breaching bottom left or bottom
                    direction = true;
                } else if (j == 0) {
                    i++; // breaching from top
                    direction = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}