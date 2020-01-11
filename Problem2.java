// Time Complexity :
//      m - size of A , n - size of each array 
//      findDiagonalOrder() - O(m*n)
//      
// Space Complexity :
//      findDiagonalOrder() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new int[]{};
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] res = new int[ m*n ];
        int cnt = 0;
        
        int dir = 1;
        int i = 0, j = 0;
        
        while(i < m && j < n)
        {
            if(dir == 1)
            {
                if(j == n-1)
                {
                    res[cnt++] = matrix[i][j];
                    dir = -1;
                    ++i;
                }
                else if(i == 0)
                {
                    res[cnt++] = matrix[i][j];
                    dir = -1;
                    ++j;
                }
                else
                {
                    res[cnt++] = matrix[i][j];
                    --i;
                    ++j;
                }
            }
            else
            {
                if(j == 0 && i < m - 1)
                {
                    res[cnt++] = matrix[i][j];
                    dir = 1;
                    ++i;
                }
                else if(j == 0 && i == m - 1)
                {
                    res[cnt++] = matrix[i][j];
                    dir = 1;
                    ++j;
                }
                else if(i == m-1)
                {
                    res[cnt++] = matrix[i][j];
                    dir = 1;
                    ++j;
                }
                else
                {
                    res[cnt++] = matrix[i][j];
                    ++i;
                    --j;
                }
            }
        }
        
        return res;
    }
}