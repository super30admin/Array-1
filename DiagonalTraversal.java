// Time Complexity :  O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
This code efficiently traverses a 2D matrix in a zigzag diagonal order,
storing elements in a 1D array. It alternates between moving up-right and down-left,
adjusting direction at boundaries.
When reaching the top boundary (except at the last column),
it moves right, while at the right boundary, it moves down.
Similarly, at the left boundary (except at the last row),
it moves down, and at the bottom boundary, it moves right.
These boundary checks ensure a smooth traversal,
covering all elements without skipping or repeating any
*/
class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        int row=0;
        int col=0;

        int[] ans=new int[m*n];
        boolean direction=true;
        int i=0;

        while(i<m*n)
        {
            ans[i++]=mat[row][col];
            if(direction)
            {
                if(row==0 && col!=n-1)
                {
                    col++;
                    direction=false;
                }
                else if(col==n-1)
                {
                    row++;
                    direction=false;
                }
                else
                {
                    row--;
                    col++;
                }

            }
            else
            {
                if(col==0 && row!=m-1)
                {
                    row++;
                    direction=true;
                }
                else if(row==m-1)
                {
                    col++;
                    direction=true;
                }
                else {
                    row++;
                    col--;
                }

            }
        }


        return ans;
    }
}