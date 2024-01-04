class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0, right = n - 1;
        List<Integer> result = new ArrayList<>();
        while(left<=right && top <=bottom)
        {
            //top row
            for(int j = left; j <=right; j ++)
            {
                result.add(matrix[top][j]);
            }
            top++;

            //right wall
            for(int i = top; i <= bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            if( left > right || top > bottom) break;

            //bottom row
            for(int j = right; j >= left; j-- )
            {
                result.add(matrix[bottom][j]);
            }
            bottom--;

            //left wall
            for(int i = bottom; i >= top; i--)
            {
                result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }
}