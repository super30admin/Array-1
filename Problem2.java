// Time Complexity : O(n*m)
// Space Complexity : O(n*m)
    // n is the number of rows and m is the number of columns

// Your code here along with comments explaining your approach
    //We use a simple logic that the numbers in a diagonal, have the same sum of their row and column indexes. (2,0),(1,1),(0,2). 
    //The total number of diagonals is the sum of rows and columns. We iterate over the sums, we will be able to traverse the matrix diagonal by diagonal.
    //We must traverse alternate diagonals in reverse order. When the indexes of row or column go out of bounds (n=3, m=3, sumOfIndexes=4, i=4, j=0), make them in-bounds in O(1) time (sumOfIndexes=4, i=2, j=sumOfIndexes-i =2).
    
class Solution {
    public int[] findDiagonalOrder(int[][] mat) 
    {
        int n = mat.length;
        int m = mat[0].length;
        int sum = 0;//i+j
        int ans[] = new int[n*m];
        int index = 0;
        while(sum<n+m-1)
        {
            if (sum%2==0)
            {
                //bottom left to top right
                //keeping sum as constant, iterate from i=sum,j=0 to i=0,j=sum => (2,0),(1,1),(0,2)
                for (int i=sum, j=0; i>=0&&j<m; i--, j++)
                {
                    if (i>=n)
                    {
                        //if it out of bounds, bring it in-bounds
                        i = n-1;
                        j = sum-i;
                    } 
                    ans[index++] = mat[i][j];
                }
            }
            else
            {
                //top right to bottom left
                //keeping sum as constant, iterate from i=0,j=sum to i=sum,j=0 => (0,2),(1,1),(2,0)
                for (int i=0, j=sum; i<n&&j>=0; i++, j--)
                {
                    if (j>=m)
                    {
                        //if it out of bounds, bring it in-bounds
                        j = m-1;
                        i = sum-j;
                    }
                    ans[index++] = mat[i][j];
                }
            }
            sum++;
        }
        return ans;
    }
}