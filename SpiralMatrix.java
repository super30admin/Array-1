
//Time Complexity: O(MN)
//Space Complexity: O(1)



class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int left = 0;
        int right = cols - 1;
        int top = 0;
        int bottom = rows - 1;
        
        List<Integer> result = new ArrayList<Integer>();
        
        while(left <= right && top <= bottom){
            
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }

            top++;
            
            if( top <= bottom ){
                for(int i = top; i <= bottom; i++){
                    result.add(matrix[i][right]);
                }
            }
            
            
            right--;

            if(top <= bottom && left <= right){

                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }   
            }
            
            bottom--;
            if( top <= bottom && left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }  
            }
            
            left++;
            
        }
        
        return result;
    }
}
