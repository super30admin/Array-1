// Time Complexity :o(m*n)
// Space Complexity : o(m*n )
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if((matrix == null) || (matrix.length == 0)) 
            return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = 0, k=0;
        int[] res = new int[(m*n)];
        int dir = 1;
        
        while(k < (m*n))
        {
            res[k++] = matrix[i][j];
            if(dir == 1)
            {
                if(j == n-1)
                {
                    i++;
                    dir = -1;
                }
                else if( i == 0)
                {
                    j++; 
                    dir = -1;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else if(dir == -1)
            {
                if (i == m-1)
                {
                    j++;
                    dir = 1;
                }
                else if(j == 0)
                {
                    i++;
                    dir = 1;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}