class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0)
        {
            return new ArrayList<Integer>();
        }
        
        int left =0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        
        List<Integer> result = new ArrayList<>();
        
        while(left<=right && top<= bottom)
        {
            //left to right
            for(int i=left;i<=right;i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            
            //top to bottom
            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            
            //right to left
            if(top<=bottom)
            {
                for(int i=right; i>=left; i--)
                  {
                     result.add(matrix[bottom][i]);
                  }
                 bottom--;
            }
            
            //bottom to top
            if(left<=right)
            {
                 for(int i=bottom; i>=top ;i--)
                     {
                        result.add(matrix[i][left]);
                     }
                 left++;
            }
           
        }
        return result;
        
    }
}

//runtime: O(mn)
//space: O(1) 
