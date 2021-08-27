// Time Complexity : O(n), n -> total number of elements in the matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english: Starting at the top left corner, we have to iterate through the two dimensional array by keeping track of the direction that you are moving(up or down). Will handle the case when you reach the top or bottom or left and right borders.  

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int height = mat.length - 1;
        int width = mat[0].length - 1;
        int[] result = new int[(height + 1) * (width + 1)];
        int row = 0, col = 0, idx = 0;
        boolean goingDown = true;
        while(!isOutOfBounds(row, col, height, width)) {
            result[idx++] = mat[row][col];
            if(!goingDown) {
                if(col == 0 || row == height) {
                    goingDown = true;
                    if(row == height) {
                        col++;
                    } else {
                        row++;
                    }
                } else {
                    row++;
                    col--;
                }
            } else {
                if(row == 0 || col == width) {
                    goingDown = false;
                    if(col == width) {
                        row++;
                    } else {
                        col++;
                    }
                } else {
                    row--;
                    col++;
                }
            }
        }
        return result;
    }
    public static boolean isOutOfBounds(int row, int col, int height, int width) {
        return row < 0 || row > height || col < 0 || col > width;
    }
}