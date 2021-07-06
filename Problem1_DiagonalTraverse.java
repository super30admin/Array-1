// Time Complexity : o(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Intially took direction=1 for upward traverse and direction=-1 for downward travese

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix.length==0||matrix==null)
            return new int[0];
        
       if(matrix.length==0 || matrix==null)
             return new int[0];
        
        int m=matrix.length,n=matrix[0].length;
        int i=0;
         int dir=1;
        int row=0,col=0;
        int[] result= new int[m*n];
        while(i<m*n)
        {
            result[i++]=matrix[row][col];
            if(dir==1)
            {
                if(row==0 && col<n-1)
                {
                    col++;
                    dir=-1;
                }
                else
                {
                    if(col==n-1)
                    {
                        row++;
                        dir=-1;
                    }
                    else
                    {
                       row--;
                       col++;
                    }
                }
            }
            else
            {
                if(col==0 && row<m-1)
                {
                row++;
                dir=1;
                }
                else
                {
                    if(row==m-1)
                    {
                        col++;
                        dir=1;
                    }
                    else
                    {
                    row++;
                    col--;
                    }
                }
            }
        }
        return result;
    }
}
