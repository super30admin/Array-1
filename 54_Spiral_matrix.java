class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0)
            return new ArrayList<>();
        
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        
        List<Integer> res = new ArrayList<>();
        
        int total = matrix.length * matrix[0].length;
        
        while(true)
        {
            for(int i=left; i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            if(left > right || top > bottom) 
                break;
            
            
            
            for(int i=top; i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(left > right || top > bottom) 
                break;
            
            
            
            for(int i=right; i>=left;i--){
                res.add(matrix[bottom][i]);
            }
            bottom--;
            if(left > right || top > bottom) 
                break;
            
            
            
            for(int i=bottom; i>=top;i--){
                res.add(matrix[i][left]);
            }
            left++;
            if(left > right || top > bottom) 
                break;
            
            
        }
        return res;
    }
}

//TC => O(m*n)
//SC => O(1)
