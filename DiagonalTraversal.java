// Time Complexity :O(m*n) where m is no of rows and n is no of columns
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes

//there are two directions, up and down so while going up we decrease row and inc column
//while going down, we inc row and dec column and if while going up our column goes out of bound,we inc row
//else if our row goes less than zero, we increase column. and while going down ifcolumn goes less than zero weinc row
//else if row goes more than max we inc column
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0)
            return new int[0];
        int dir = 1;
        int row = mat.length;
        int col = mat[0].length;
        int[] result = new int[row * col];
        int ptr = 0;
        int i = 0;
        int j = 0;
        while (ptr < result.length) {
            result[ptr] = mat[i][j];
            ptr++;
            if (dir == 1) {
                if (j >= col - 1) {
                    i++;
                    dir = -1;
                } else if (i <= 0) {
                    dir = -1;
                    j++;
                } else {

                    i--;
                    j++;
                }
            } else if (dir == -1) {
                if (i >= row - 1) {
                    j++;
                    dir = 1;
                } else if (j <= 0) {
                    dir = 1;
                    i++;
                } else {

                    i++;
                    j--;
                }
            }

        }
        return result;
    }
}