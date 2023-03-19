public class Solution
{
    public IList<int> SpiralOrder(int[][] matrix)
    {
        var result = new List<int>();
        int m = matrix.Length;
        int n = matrix[0].Length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        while (top <= bottom && left <= right)
        {
            for (int j = left; j <= right; j++)
            {
                result.Add(matrix[top][j]);
            }
            top++;
            if (top <= bottom && left <= right)
            {
                for (int i = top; i <= bottom; i++)
                {
                    result.Add(matrix[i][right]);
                }
            }
            right--;
            if (top <= bottom && left <= right)
            {
                for (int j = right; j >= left; j--)
                {
                    result.Add(matrix[bottom][j]);
                }
            }
            bottom--;
            if (top <= bottom && left <= right)
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