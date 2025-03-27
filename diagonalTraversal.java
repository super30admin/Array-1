// Time Complexity : O(m * n) m number of rows and n number of columns
// Space Complexity : O(m* n)
// Did this code successfully run on Leetcode : Yes


// Approach:
// Traverse the matrix diagonally by switching between upward ('u') and downward ('d') directions.
// Move diagonally in the current direction until a boundary is hit, then adjust the indices accordingly.
// Continue this process until all elements are added to the output array.

public class diagonalTraversal 
{
    public int[] findDiagonalOrder(int[][] mat) 
    {
        int[] op = new int[mat.length*mat[0].length];
        int i=0;
        int j=0;
        int c=0;
        char d = 'u';
        while(c!=(mat.length*mat[0].length))
        {
            op[c] = mat[i][j];
            if(d=='u')
            {
                if(j+1<mat[0].length && i-1<0)
                {
                        j=j+1;
                        d  = 'd';
                }
                else if(j+1>=mat[0].length)
                {
                    i=i+1;
                    d  = 'd';
                }
                else
                {
                    i=i-1;
                    j=j+1;
                }
            }
            else
            {
                if(j-1<0 && i+1<mat.length)
                {
                    i=i+1;
                    d = 'u';
                }
                else if(i+1>=mat.length)
                {
                    j=j+1;
                    d = 'u';
                }
                else
                {
                    i=i+1;
                    j=j-1;
                }
            }
            c++;
        }

        return op;    
    }
}
