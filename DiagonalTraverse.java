// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :yes

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {


        //upward direction -> +1, also results in lowering of the row
        //downward direction ->-1 also results in lowering of col

        if(mat==null || mat.length==0)
            return new int[]{};

        int m = mat.length;
        int n = mat[0].length;

        int result[] = new int[m*n];

        int i=0,row=0,col=0;
        int direction=1;

        while(i<m*n)
        {
            result[i]=mat[row][col];
            if(direction==1)
            {
                if(col==n-1)
                {
                    direction =-1;
                    row++;
                }
                else if(row==0)
                {
                    direction=-1;
                    col++;


                }else
                {
                    row--;
                    col++;
                }
            }
            else
            {
                if(row==m-1)
                {
                    direction=1;
                    col++;


                }
                else if(col==0)
                {
                    direction=1;
                    row++;
                }
                else
                {
                    row++;
                    col--;
                }


            }
            i++;
        }
        return result;

    }
}