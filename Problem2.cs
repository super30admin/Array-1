public class Solution
    {
        // Time Complexity : O(m * n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        public int[] FindDiagonalOrder(int[][] mat)
        {
            int m = mat.Length;
            int n = mat[0].Length;

            int[] result = new int[m * n];
            int resultIndex = 0;
            int i = 0;
            int j = 0;
            bool direction = true;//up
            //until all elements are traversed
            while(resultIndex < m * n)
            {
                result[resultIndex] = mat[i][j];
                resultIndex++;

                //direction is up
                if(direction)
                {
                    if(i == 0 && j != n-1) //first row
                    {
                        j++;
                        direction = false;
                    }
                    else if(j == n-1) //last column
                    {
                        i++;
                        direction = false;
                    }
                    else
                    {
                        i--;
                        j++;
                    }
                }

                //direction is down
                else
                {
                    if (j == 0 && i != m - 1) //first column
                    {
                        i++;
                        direction = true;
                    }
                    else if (i == m - 1) //last column
                    {
                        j++;
                        direction = true;
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
