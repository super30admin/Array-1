// Time Complexity : O(n*m) where n is the number of rows and m is the number of columns in the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english 
// 1. We traverse the matrix in a diagonal manner, starting from the top-left corner.
// 2. We use a boolean variable to keep track of the direction of traversal (up-right or down-left).
// 3. We update the row and column indices based on the current direction 
// and the boundaries of the matrix. We store the elements in the result array as we traverse.
// The auxiliary space is O(1) as we are using only a few variables to keep track of the current position and direction,
//  and the result array is not considered auxiliary space as it is required for the output.

// Your code here along with comments explaining your approac

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        boolean direction = true; // true = up-right, false = down-left

        int row = mat.length;
        int col = mat[0].length;

        int[] result = new int[row * col];

        int r = 0, c = 0;

        for (int i = 0; i < row * col; i++) {

            result[i] = mat[r][c];

            if (direction) {
                if (c == col - 1) {
                    r++;
                    direction = false;
                } else if (r == 0) {
                    c++;
                    direction = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == row - 1) {
                    c++;
                    direction = true;
                } else if (c == 0) {
                    r++;
                    direction = true;
                } else {
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}