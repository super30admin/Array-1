using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCodeSuper30
{
    class FindDiagonalOrderLC
    {
        //Time Complexity: O(m*n)
        //Space Complexity: O(1)
        public int[] FindDiagonalOrder(int[][] mat)
        {
            if (mat == null || mat.Length == 0)
            {
                return new int[] { };
            }
            int m = mat.GetLength(0);
            //int n = mat.GetLength(1);
            int n = mat[0].Length;
            int[] result = new int[m * n];
            int i = 0, r = 0, c = 0;
            int dir = 1;
            //dir = 1 bottom to top
            //dir = -1 top to bottom
            while (i < m * n)
            {
                result[i] = mat[r][c];
                if (dir == 1)
                {
                    if (c == n - 1)
                    {
                        dir = -1;
                        r++;
                    }
                    else if (r == 0)
                    {
                        dir = -1;
                        c++;
                    }
                    else
                    {
                        r--;
                        c++;
                    }
                }
                else
                {
                    if (r == m - 1)
                    {
                        dir = 1;
                        c++;
                    }
                    else if (c == 0)
                    {
                        dir = 1;
                        r++;
                    }
                    else
                    {
                        r++;
                        c--;
                    }

                }
                i++;
            }
            return result;
        }
    }
}
