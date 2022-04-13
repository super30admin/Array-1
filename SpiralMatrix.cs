using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class SpiralMatrix
    {
        /*
         * T.C: O(m*n) : since we are traversing through all element of input element
         * S.C: O(1): as return result which count as constant.
         */
        public IList<int> SpiralOrder(int[][] matrix)
        {

            IList<int> result = new List<int>();
            int top = 0;
            int bottom = matrix.Length - 1;
            int left = 0;
            int right = matrix[0].Length - 1;

            while (left <= right && top <= bottom)
            {
                //left to right
                for (int i = left; i <= right; i++)
                {
                    result.Add(matrix[top][i]);
                }
                top++;

                //top to bottom 
                for (int j = top; j <= bottom; j++)
                {
                    result.Add(matrix[j][right]);
                }
                right--;

                if (top <= bottom)
                {
                    //right to left
                    for (int i = right; i >= left; i--)
                    {
                        result.Add(matrix[bottom][i]);
                    }
                    bottom--;
                }


                if (left <= right)
                {
                    //bottom to top
                    for (int j = bottom; j >= top; j--)
                    {
                        result.Add(matrix[j][left]);
                    }
                    left++;
                }

            }
            return result;
        }
    }
}
