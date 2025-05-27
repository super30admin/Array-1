/*
  Time complexity: O(m*n)
  Space complexity:O(1)

  Code ran successfully on Leetcode: Yes

  Approach: When travelling upwards we can meet the top or right boundaries. Similarly when going downwards, we can meet the bottom or left boundaries. Appropriate checks are added to monitor these conditions, on satisfying which we change the traversal direction.

*/

public class Solution {
    public int[] FindDiagonalOrder(int[][] mat) {
        int m = mat.Length;
        int n = mat[0].Length;
        bool top = true;
        int[] result = new int[m*n];

        int i = 0, j= 0, count = 0;

        while(count<m*n)
        {
            if(top)
            {
                if(j==n-1)
                {
                    result[count] = mat[i][j];
                    top = false;
                    i++;
                }
                else
                {
                    if(i==0)
                    {
                        result[count] = mat[i][j];
                        top = false;
                        j++;
                    }
                    else
                    {
                        result[count] = mat[i][j];
                        i--;
                        j++;
                    }
                }
            }
            else
            {
                if(i==m-1)
                    {
                        result[count] = mat[i][j];
                        top = true;
                        j++;
                    }
                
                else
                {
                    if(j==0)
                    {
                        result[count] = mat[i][j];
                        top = true;
                        i++;
                    }
                    else
                    {
                        result[count] = mat[i][j];
                        i++;
                        j--;
                    }
                }
            }


            count++;
        }

        return result;
    }
}
