class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if(matrix.length == 0) return result;
    
    int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
    
     while(top<=bottom && left <=right){
         // top row
         for(int i =left; i<=right; i++){
             result.add(matrix[top][i]);
         }
         top++;
         // right coloum
         for(int i = top;i<=bottom;i++){
             result.add(matrix[i][right]);
         }
         right--;
         if(top <= bottom){
         //Bottom row
         for(int i = right; i>=left; i--){
             result.add(matrix[bottom][i]);
            }
         }
         bottom--;
         if(left <=right){
         // left coloum
            for(int i = bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
         }
         left++;
     }
        return result;
        
    }
}