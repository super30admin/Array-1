// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english: set initial position at (0,0) and traverse the matrix in diagonal order by changing direction when hitting the boundaries until all elements are traversed.

// Your code here along with comments explaining your approach: Traverse the matrix in diagonal order by changing direction when hitting the boundaries. Set initial position at (0,0) and keep track of the direction of traversal. If the direction is upwards, move to the next column if at the last column, else move to the previous row if at the first row, else move diagonally up. If the direction is downwards, move to the next row if at the last row, else move to the next column if at the first column, else move diagonally down. Continue this process until all elements are traversed and stored in the result array.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m*n];
        int r = 0, c = 0;

        boolean dir = true;

        for(int i = 0; i < m * n; i++) {
            result[i] = mat[r][c];

            if(dir) {
                if(c == n - 1) {
                    r++;
                    dir = false;
                }
                else if(r == 0) {
                    c++;
                    dir = false;
                }
                else {
                    r--; c++;
                }
            } else {
                if(r == m - 1) {
                    c++;
                    dir = true;
                }
                else if(c == 0) {
                    r++;
                    dir = true;
                }
                else {
                    r++; c--;
                }
            }
        }

        return result;
    }
}
