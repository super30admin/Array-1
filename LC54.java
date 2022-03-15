class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int top = 0;
        int bottom = matrix.length-1;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int left = 0;
        int right = matrix[0].length-1;
        
        while(left<=right && top<=bottom)
        {
            if(left<=right && top<=bottom)
            {
                for(int i=left;i<=right;i++)
                {
                    arr.add(matrix[top][i]);
                }
            }
            
            top++;
            
            if(left<=right && top<=bottom)
            {
                for(int i=top;i<=bottom;i++)
                {
                    arr.add(matrix[i][right]);
                }
            }
            
            right--;
            
            if(left<=right && top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    arr.add(matrix[bottom][i]);
                }
            }
            
             bottom--;
            
            if(left<=right && top<=bottom)
            {
                for(int i=bottom;i>=top;i--)
                {
                    arr.add(matrix[i][left]);
                }
            }
            
            left++;
        }
        
        return arr;
    }
}