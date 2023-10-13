// Time Complexity : O(M*N) where M is rows & N is columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class DiagonalTraverse
{
    class Solution {
        public int[] findDiagonalOrder(int[][] mat)
        {
            boolean dir = true;
            int rows = mat.length;
            int cols = mat[0].length;
            int[] ans = new int[rows * cols];
            int count = 0, r = 0, c = 0;

            while(count < rows * cols)//(r < rows && c < cols && r >= 0 && c >= 0)
            {
                ans[count] = mat[r][c]; count++;

                if(dir == true)
                {
                    if(r == 0 && c < cols-1)
                    {
                        c = c+1; dir = false;
                    }
                    else if(c == cols-1)
                    {
                        r++; dir = false;
                    }
                    else
                    {
                        r--; c++;
                    }
                }
                else
                {
                    if(r == rows-1 )
                    {
                        c = c+1; dir = true;
                    }
                    else if(c == 0)
                    {
                        r++; dir = true;
                    }
                    else
                    {
                        r++; c--;
                    }
                }
            }
            return ans;
        }
    }
}
