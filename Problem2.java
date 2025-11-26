//Time Complexity : O(m * n)
//Space Complexity : O(1)  // excluding the result array
//Did this code successfully run on Leetcode : Yes
// We move through the matrix diagonally in two directions: up-right and down-left.
// Whenever we hit a boundary (top, bottom, left, or right), we switch direction.
// We keep updating the row and column based on the current direction until all elements are added.
// This allows us to traverse the entire matrix in the required diagonal zig-zag order.
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m * n];
        int r = 0, c = 0;
        boolean up = true; // true = up-right, false = down-left

        for (int i = 0; i < m * n; i++) {

            result[i] = mat[r][c]; // add current element

            if (up) {  // moving up-right ↗

                if (c == n - 1) {     // hit RIGHT wall
                    r++;              // move DOWN
                    up = false;       // change direction
                } 
                else if (r == 0) {    // hit TOP wall
                    c++;              // move RIGHT
                    up = false;       // change direction
                }
                else {                // normal up-right move
                    r--; 
                    c++;
                }

            } else { // moving down-left ↘

                if (r == m - 1) {     // hit BOTTOM wall
                    c++;              // move RIGHT
                    up = true;        // change direction
                }
                else if (c == 0) {    // hit LEFT wall
                    r++;              // move DOWN
                    up = true;        // change direction
                }
                else {                // normal down-left move
                    r++; 
                    c--;
                }
            }
        }

        return result;
    }
}

