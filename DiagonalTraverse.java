//TC = O(n*m)
//SC = O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        boolean dir = true;
        int i = 0, j = 0;
        for(int idx = 0; idx < result.length; idx++)
        {
            result[idx] = mat[i][j];
            if(dir)
            {
                if(i == 0 && j != n-1)
                {
                    dir = false; j ++;

                }
                else if(j == n -1) 
                {
                    i++; dir = false;
                }
                else
                {
                    i--;j++;
                }
            }
            else
            {
                if(j == 0 && i != m-1)
                {
                    dir = true;
                    i++;
                }
                else if(i == m-1)
                {
                    dir = true; j ++;
                }
                else
                {
                    i++;j--; 
                }
            }
        }
        return result;

    }
}