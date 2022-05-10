using System;
using System.Collections.Generic;

namespace Algorithms
{
    public class Array_SpiralOrder
    {
        /// Time Complexity : O(M*N) 
        // Space Complexity :O(1) 
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  No
        public IList<int> SpiralOrder(int[][] matrix)
        {

            List<int> result = new List<int>();
            if (matrix == null || matrix.Length == 0) return result;

            int rows = matrix.Length;
            int columns = matrix[0].Length;
            int top = 0, bottom = rows - 1;
            int left = 0, right = columns - 1;

            while (result.Count < rows * columns)
            {
                //left to right 
                for (int col = left; col <= right; col++)
                {
                    result.Add(matrix[top][col]);
                }
                //top to bottom
                for (int row = top + 1; row <= bottom; row++)
                {
                    result.Add(matrix[row][right]);
                }
                if (top != bottom)
                {
                    //right to left

                    for (int col = right - 1; col >= left; col--)
                    {
                        result.Add(matrix[bottom][col]);
                    }
                }
                if (left != right)
                {
                    //bottom to top

                    for (int row = bottom - 1; row > top; row--)
                    {
                        result.Add(matrix[row][left]);
                    }
                }
                left++;
                right--;
                top++;
                bottom--;

            }
            return result;

        }
    }
}
