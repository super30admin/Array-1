//TC : O(mn) SC: O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List result = new ArrayList();

        int top = 0;
        int left = 0;
        int bottom = m-1;
        int right = n-1;

        while(right >=left && bottom >= top)
        {
            //from left to right
            for(int i=left;i<=right;i++)
                result.add(matrix[top][i]);
            top++;

            //top to bottom
            for(int i=top;i<=bottom;i++)
                result.add(matrix[i][right]);
            right--;
            if(bottom>=top)
            {
                //right to left 
                for(int i=right;i>=left;i--)
                    result.add(matrix[bottom][i]);
                bottom--;
            }
            if(right>=left)
            {
                //bottom to top
                for(int i=bottom;i>=top;i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }

        return result;
    }
}