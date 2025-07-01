// Time Complexity : O(n*m)
// Space Complexity : O(1) as space occupied by the output array doesn't count towards the space complexity since that is a requirement of the problem itself
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english -  I use a boolean to mark which direction that I am going to - up or down. If I am going up, I do i-- and j++. If we are in middle, j is not at end, we move j forward to maintain a rightward direction, in the case we are on last column, we have finished all elements in the first row, so we move down the row. Same logic for going down.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m * n];
        int i = 0, j = 0, idx = 0;
        boolean up = true;
        while (idx < m * n) {
            if (up) {
                while (i >= 0 && j < n) res[idx++] = mat[i--][j++];
                i++; j--; 
                up = false;
                if (j + 1 < n) j++;
                else i++;
            } else {
                while (i < m && j >= 0) res[idx++] = mat[i++][j--];
                i--; j++; 
                up = true;
                if (i + 1 < m) i++;
                else j++;
            }
        }
        return res;
    }
}
