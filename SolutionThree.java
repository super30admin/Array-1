//Time Complexity: O(m*n)
// Space complexity: O(1)
class SolutionThree {
    public List<Integer> spiralOrder(int[][] matrix) {
        //Edge case
        if(matrix == null || matrix.length ==0){
            return new ArrayList<>();
        }
        
        int left = 0; //first column
        int right = matrix[0].length-1; // last column
        int top = 0; //first row;
        int bottom = matrix.length-1; //last row
        List<Integer> result = new ArrayList<>();
        
        while( top <= bottom && left <= right){
            // top 
            for(int i = left; i<= right; i++ ){
                result.add(matrix[top][i]);
            }
            top++;
            
            // right 
            for(int i = top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            // bottom
            if(top <= bottom){
                for(int i=right; i>= left; i--){
                    result.add(matrix[bottom][i]);
                }                
            }
            bottom--;
            
            // left
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        
        return result;
    }
}
