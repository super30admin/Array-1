class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int left=0;
        int top=0;
        int bottom = m-1;
        int right = n-1;
        int index=0;
        
        
        while(top<=bottom && left<=right)
        {
           if(top<=bottom && left<=right)
           {
            for(int i = top ;i<=right;i++)
            {
                res.add(matrix[top][i]);
                index++;
            }
            top++;
           }
            
            if(top<=bottom && left<=right){
            for(int i = top ; i<=bottom;i++)
            {
                res.add(matrix[i][right]);
                index++;
                
            }
            
            
            right--;
            }
            
            if(top<=bottom){
            
            for(int i = right;i>=left;i--)
            {
                res.add(matrix[bottom][i]);
                index++;
                
            }
            bottom--;
            }
            if( left<=right)
            {
            
            for(int i=bottom;i>=top;i--)
            {
                res.add(matrix[i][left]);
                index++;
            }
            left++;
            }
        }
        
        return res;
        
        
    }
}