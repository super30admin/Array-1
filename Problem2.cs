// Time Complexity : O(m*n) where n is the total number of rows and m is the total number of columns of mat
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


public class Solution
{
    public int[] FindDiagonalOrder(int[][] mat)
    {
        int rows = mat.Length, columns = mat[0].Length;
        int dir = 1, count = 0, i = 0, j = 0;
        int[] result = new int[rows * columns];

        while (count < rows * columns)
        {
            result[count] = mat[i][j];
            count++;

            if (dir == 1)
            {
                if (j == columns - 1)
                {
                    i += 1;
                    dir = -1;
                }

                else if (i == 0)
                {
                    j += 1;
                    dir = -1;
                }

                else
                {
                    i--;
                    j++;
                }
            }

            else if (dir == -1)
            {
                if (i == rows - 1)
                {
                    j++;
                    dir = 1;
                }

                else if (j == 0)
                {
                    i += 1;
                    dir = 1;
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