class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left =0;
        int top =0;
        int m = matrix.length;
        int n = matrix[0].length;
        int right = n - 1;
        int bottom = m -1;
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length==0)
            return result;
        while(left<=right && top<=bottom)
        {
            //top row
            for(int j=left;j<=right;j++)
            {
                result.add(matrix[left][j]);
            }
            top++;
            //right column
            if(left<=right && top<=bottom)
            {
                for(int i=top;i<=bottom;i++)
                {
                    result.add(matrix[i][right]);
                }
            }
            right--;

            //bottomrow
            if(left<=right && top<=bottom)
            {
                for(int j=right;j>=left;j--)
                {
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;
            //leftwo
            if(left<=right && top<=bottom)
            {
                for(int i=bottom;i>=top;i--)
                {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}
//Time complexity is o(m*n).
//Space is O(1).