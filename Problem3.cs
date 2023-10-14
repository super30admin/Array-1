public class SpiralMatrix
    {
        // Time Complexity : O(m * n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        public IList<int> SpiralOrder(int[][] matrix)
        {
            int m = matrix.Length;
            int n = matrix[0].Length;

            IList<int> list = new List<int>();
            int left = 0;
            int right = n - 1;
            int top = 0;
            int bottom = m - 1;

            while(left <= right && top <= bottom) //base condition
            {
                //top -- i -> left to right
                for(int j = left; j <= right; j++)
                {
                    list.Add(matrix[top][j]);
                }
                top++;

                //right -- j -> top to bottom (not needed to check base condition as for loop takes care of that condition)
                for (int i = top; i <= bottom; i++)
                {
                    list.Add(matrix[i][right]);
                }
                right--;
                

                //bottom -- i -> right to left (need to check base condition for top-> bottom as we have mutated top, not needed for right -> left as for loop takes care of it)
                if (top <= bottom)
                {
                    for (int j = right; j >= left; j--)
                    {
                        list.Add(matrix[bottom][j]);
                    }
                    bottom--;
                }

                //left -- j -> bottom to top (need to check base condition for left->right as we are have mutated right, not needed for bottom->top as for loop takes care of it)
                if (left <= right)
                {
                    for (int i = bottom; i >= top; i--)
                    {
                        list.Add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return list;
        }
    }
