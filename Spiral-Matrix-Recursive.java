class Solution {
    List<Integer> result=new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return result;
        helper(matrix, 0, matrix[0].length - 1, 0, matrix.length - 1);
        return result;
    }
    public void helper(int[][] matrix, int left, int right, int top, int bottom){
        // Base case pointers cross each other
        if(left > right || top > bottom) return;
        // top row
        for(int i = left; i <= right; i++){
            result.add(matrix[top][i]);
        }
        top++;
        //right column
        for(int i = top; i <= bottom; i++){
            result.add(matrix[i][right]);
        }
        right--;
        if(top <= bottom){
              //Bottom row
            for(int i = right; i >= left; i--){
                result.add(matrix[bottom][i]);
            }
        }
        bottom--;
        if(left <= right){
              //left column
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
        }
        left++;
        helper(matrix,left, right, top, bottom); 
    }
}
