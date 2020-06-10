// Time Complexity : O(m * n) --> where m and n are the length of input array
// Space Complexity : O(1) --> as the extra space O(m * n) which we are creating are returning as output so will not considered as auxillary space
// Did this code successfully run on Leetcode (498): Yes
// Three line explanation of solution in plain english: In this problem, there are 2 cases, (1) moving in upward direction and (2) moving in downward direction. We are handling the pointer depending upon the case and changing the direction accordingly. We have handled the corner/edge cases as well while traversing the matrix. In simple words: while travelling in upward direction we are incrementing column index and decrementing row index and reverse of this while going downward direction. 

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];
        
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = 0;
        int dir = 1;
        int i = 0;
        
        int result[] = new int[m * n];
        
        while (i < m*n) {
            result[i] = matrix[r][c];
            // case1: upward direction
            if (dir == 1) {
                if (c == n-1) {
                    r++;
                    dir = -1;
                }
                else if (r == 0) {
                    c++;
                    dir = -1;
                }
                else {
                    r--;
                    c++;
                }
            }
            
            // case2: downward direction
            else {
                if (r == m-1) {
                    c++;
                    dir = 1;
                }
                else if (c == 0) {
                    r++;
                    dir = 1;
                }
                else {
                    c--;
                    r++;
                }                
            }
            i++;
        }
        return result;
    }
}