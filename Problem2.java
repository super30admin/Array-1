// Leetcode 498. Diagonal Traverse
/** 3 Pointer Approach: 
 *  1. Define 1 and -1 as dorections for upward and downward movement respectivily.
 *  2. Direction from 1 to -1 will be changed on reaching ->  0th row or last column
 *  3. Direction from -1 to 1 will be changed on reaching ->  0th column or last row
 *  4. put the check for row and column should not exceed their max length and not go below 0th index.
 *  5. while updward => col++ row-- | while downward => col-- row++
 */ 
//
//time Complexity :
// O(M*N)

// Space Complexity :
// O(1) since we don't make use of any additional data structure and output array should not be consider as extra space.

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0)
            return new int[0];

        int rlen = matrix.length, r = 0;
        int clen = matrix[0].length, c = 0;

        int[] arr = new int[rlen * clen];

        int count = 0;

        int dir = 1;

        // 00 01 02 03 04
        // 10 11 12 13 14
        // 20 21 22 23 24
        // 30 31 32 33 34

        while (count < arr.length) {

            // boundary Up
            if (dir == 1) {

                if (c >= 0 && c < clen && r >= 0 && r < rlen) {
                    arr[count++] = matrix[r][c];

                    if (c == clen - 1) {
                        dir = -1;
                        r++;
                    } else if (r == 0) {
                        dir = -1;
                        c++;
                    } else {
                        c++;
                        r--;
                    }
                }
            }

            // boundary Up
            if (dir == -1) {

                if (c >= 0 && c < clen && r >= 0 && r < rlen) {
                    arr[count++] = matrix[r][c];

                    if (r == rlen - 1) {
                        dir = 1;
                        c++;
                    } else if (c == 0) {
                        dir = 1;
                        r++;
                    } else {
                        c--;
                        r++;
                    }
                }
            }

        }

        return arr;

    }
}