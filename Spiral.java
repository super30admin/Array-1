class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return res;
        
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;
        
        while(top <= bottom && left <= right){
            
            //top row
            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            
            //right col
            for(int i=top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            
            //bottom row
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //left col
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}

//Time Complexity :O(m*n)
//Space Complexity :O(1)