public class Solution {
    public IList<int> SpiralOrder(int[][] matrix) {
        List<int> list = new List<int>();
        if(matrix.Length==0)
        {
            return list;
        }
        
         var row = matrix.Length;
        var col = matrix[0].Length;
        
        int top = 0, right = col - 1, bottom = row - 1, left = 0;
        int i = 0, j = 0;
        while (bottom >= top || right >= left)
        {
            // top traversal
            if (j <= right)
            {
                while (j <= right)
                    list.Add(matrix[i][j++]);
                top++;
                i++;
                j--;
            }
            else break;
            // right traversal
            if (i <= bottom)
            {
                while (i <= bottom)
                    list.Add(matrix[i++][j]);
                right--;
                j--;
                i--;
            }
            else break;
            // bottom traversal
            if (j >= left)
            {
                while (j >= left)
                    list.Add(matrix[i][j--]);
                bottom--;
                i--;
                j++;
            }
            else break;
            // left traversal
            if (i >= top)
            {
                while (i >= top)
                    list.Add(matrix[i--][j]);
                left++;
                j++;
                i++;
            }
            else break;
        }
​
        return list;
    }
}
        
       
        
