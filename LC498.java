class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        
        int i = 0;
        int j = 0;
        
        int result[] = new int[m*n];
        
        boolean direction = true;
        
        for(int idx = 0;idx<m*n;idx++)
        {
            result[idx] = mat[i][j];
            
            if(direction)
            {
                if(j==n-1)
                {
                    direction = false;
                    i++;
                }
                else if(i==0)
                {
                    direction = false;
                    j++;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else
            {
                if(i==m-1)
                {
                    direction = true;
                    j++;
                }
                else if(j==0)
                {
                    direction = true;
                    i++;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }
        
        return result;
    }
}