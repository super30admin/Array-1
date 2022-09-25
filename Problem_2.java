// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[] {};
        
        int m = mat.length;
        int n = mat[0].length;
        int result[] = new int[m*n];
        int r = 0;
        int c = 0;
        int dir = 1;
        int idx = 0;
        while(idx <  m * n)
        {
            result[idx] = mat[r][c];
            idx++;
            if(dir == 1)
            {
                if(c == n-1)
                {
                    dir = -1;
                    r++;
                }
                else if(r == 0)
                {
                    dir = -1;
                    c++;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else
            {
                if(r == m-1)
                {
                    dir = 1;
                    c++;
                }
                else if(c==0)
                {
                    dir = 1;
                    r++;
                }
                else
                {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}