class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        
        List<Integer> array = new ArrayList<>();
        
        if(matrix.length==0 || matrix == null)
            return array;
        int m = matrix.length;
        int n = matrix[0].length;
        int top =0; int left = 0;
        int right = n-1;
        int bottom = m -1;
        
        while(left <= right && top <= bottom)
        {
            //top row
            for(int i=left; i<=right; i++)
                array.add(matrix[top][i]);
            top ++;
            
            //right column
            for(int i=top; i<=bottom; i++)
                array.add(matrix[i][right]);
            right --;
            
            //bottom row;
            if(top<=bottom)
            {
                for(int i=right; i>=left; i--)
                    array.add(matrix[bottom][i]);
                bottom --;
             
            }
            
            
            if(left <=right)
            {
                //left colum;
                for(int i=bottom; i>=top; i--)
                    array.add(matrix[i][left]);
                left ++; 
            }
            
          
        } 
        
        return array;
        
    }
    
    
 
}
