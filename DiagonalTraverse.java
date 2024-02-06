// Time Complexity : O(m X n)
// Space Complexity :  [Not using any extra space] only counters
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
/*
 * I've used one flag for direction, and starting with upward direction (flag = true) and straight away inserting first element in result
 * When going upwards I'm moving i-- and j++(normal cell), 
 * But If reached the extreme right side(j == n-1 [last cell for the column]) then only doing i-- and setting flag false(change direction)
 * If reached extreme up(ceiling) then doing j++ and flag = false;
 * For downward doing exact opposite of the above, (normal cell i++, J--), extreme left cell for given row(i++, flag = true), last row cells(j++ and flag true)
*/

// Your code here along with comments explaining your approach

class DiagonaTraverse {
    public int[] findDiagonalOrder(int[][] mat) {

        boolean isUp = true;
        int m = mat.length;
        int n = mat[0].length;
        int result[] = new int[m * n];

        int i = 0;
        int j = 0;
        int k = 0;
        while (k < m * n) {

            result[k] = mat[i][j];

            if (isUp) {

                if (j == n - 1) {
                    i++;
                    isUp = false;
                } else if (i == 0) {
                    j++;
                    isUp = false;
                } else {
                    i--;
                    j++;
                }

            } else {

                if (i == m - 1) {
                    j++;
                    isUp = true;
                } else if (j == 0) {
                    i++;
                    isUp = true;
                } else {
                    i++;
                    j--;
                }
            }

            k++;

        }

        return result;
    }
}