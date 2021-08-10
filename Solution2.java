// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfuly run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0){
            return new int[] {};
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int i = 0, r = 0, c = 0;

        int dir = 1;

        while(i < m * n){
            result[i] = mat[r][c];
            if(dir == 1){
                if(c == n - 1){
                    dir -= 1;
                    r++;
                }
                else if(r == 0){
                    dir -= 1;
                    c++;
                }
                else {
                    r--;
                    c++;
                }
            }
            else {
                if (r == m - 1){
                    dir = 1;
                    c++;
                }
                else if(c == 0){
                    dir = 1;
                    r++;
                }
                else {
                    r++;
                    c--;
                }
            }
            i++;
        }
        return result;
    }
}