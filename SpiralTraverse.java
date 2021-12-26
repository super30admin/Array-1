public class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int m = matrix.length; 
        int n = matrix[0].length; 
        int top = 0, bottom = m-1;
        int left = 0 , right = n -1 ; 
        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);
            }
            top ++;
            for(int i = top; i <= bottom; i++ ){
                result.add(matrix[i][right]);
            }
            right --; 
            for(int j = right; j >= left; j--){
                result.add(matrix[bottom][j]);
            }
            bottom--;
            for(int i = bottom; i>= top; i--){
                result.add(matrix[i][left]);
            }
            left ++;
        }
    return result; 
    }
}
