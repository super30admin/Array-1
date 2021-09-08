class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        int top= 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        
        
        while(left<= right && top <= bottom ){
            //top row
            for(int i = left; i<= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(left<= right && top <= bottom){
             for(int i = right; i>= left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
             if(left<= right && top <= bottom){
             for(int i = bottom; i>= top; i--){
                result.add(matrix[i][left]);
            }
            left++;
             }
            
        }
            
        return result;
        
        
    }
}
