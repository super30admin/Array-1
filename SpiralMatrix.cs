using System;
using System.Collections.Generic;
using System.Text;

namespace LeetCodeSuper30
{
    class SpiralMatrixLC
    {
        //Time Complexity: O(m*n)
        //Space Complexity: O(1)
        public List<int> SpiralOrder(int[][] matrix)
        {
            if (matrix ==null || matrix.Length == 0)
            {
                return new List<int>();
            }
            List<int> result = new List<int>();
            int m = matrix.GetLength(0);
            int n = matrix.GetLength(1);
            int top = 0, bottom = m - 1;
            int left = 0, right = n - 1;
            while (top <= bottom && left <= right)
            {
                //left to right
                for (int i = left; i <= right; i++)
                {
                    result.Add(matrix[top][i]);
                }
                top++;
                //top to bottom
                for (int i = top; i <= bottom; i++)
                {
                    result.Add(matrix[i][right]);
                }
                right--;
                //right to left
                if (top <= bottom)
                {
                    for (int i = right; i >= left; i--)
                    {
                        result.Add(matrix[bottom][i]);
                    }
                }
                bottom--;
                //bottom to top
                if (left <= right)
                {
                    for (int i = bottom; i >= top; i--)
                    {
                        result.Add(matrix[i][left]);
                    }
                }
                left++;
            }
            return result;
        }
    }
}
