// Time Complexity : O(nm)
// Space Complexity : O(1)
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        
        int top = 0 , bottom = n-1 , left = 0, right = m-1;
        
        while(top <= bottom && left <= right)
        {
            // outermost first row
            for(int j = left; j <= right ; j ++)
            {
                result.add(matrix[top][j]);
            }
            // move to next row
            top++;
            // outermost last column
            for(int i = top; i <= bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            // move one column inside
            right--;
            //check if we already covered this row
            if(top <= bottom)
            {
                // outermost last row
                for(int j = right ; j >= left ; j--)
                {
                    result.add(matrix[bottom][j]);
                }
                // move to one row above
                bottom--;
            }
            // check if we already covered this column
            if(left <= right)
            {
                for(int i = bottom ; i >= top; i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
