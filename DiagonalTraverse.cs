using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class DiagonalTraverse
    {
        /*
         * T.C: O(m*n) since we are traversing through whole array
         * S.C: O(1) as we are returning result and not using extra space
         */
        public int[] FindDiagonalOrder(int[][] mat)
        {

            int m = mat.Length;
            int n = mat[0].Length;
            int[] result = new int[m * n];
            int row = 0;
            int col = 0;
            int index = 0;
            int dir = 1;

            while (index < (m * n))
            {
                result[index] = mat[row][col];
                index++;

                //travers from bottom to top
                if (dir == 1)
                {
                    if (col == n - 1)
                    {
                        dir = -1;
                        row++;
                    }
                    else if (row == 0)
                    {
                        dir = -1;
                        col++;
                    }
                    else
                    {
                        row--;
                        col++;
                    }
                }
                //traverse from top to bottom
                else
                {
                    if (row == m - 1)
                    {
                        dir = 1;
                        col++;
                    }
                    else if (col == 0)
                    {
                        dir = 1;
                        row++;
                    }
                    else
                    {
                        col--;
                        row++;
                    }
                }


            }

            return result;

        }
    }
}
