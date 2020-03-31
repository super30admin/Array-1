//TimeComplexity: O(n) where n is number of elements in matrix. 
//Space Complexity: O(1)


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null)
            return null;
        int m = matrix.length;
        int n = 0;
        if (m>0)
            n = matrix[0].length;
       
        int [] res = new int[m*n];
        int r = 0, c = 0;
        for(int i = 0; i < res.length; i++)
        {
            res[i] = matrix[r][c];
            if((r+c) % 2 == 0)
            {
                if(c == n - 1)
                    r++;
                else if (r==0)
                    c++;
                else
                {
                    c++;
                    r--;
                }
            }
            else
            {
                if(r==m -1)
                    c++;
                else if (c==0)
                    r++;
                else
                {
                    c--;
                    r++;
                }
                    
            }
        }
            
       return res; 
        
    }
}