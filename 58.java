//Recursive
class Solution {
    List<Integer> result=new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return result;
        helper(matrix, 0, matrix[0].length - 1, 0, matrix.length - 1);
        return result;
    }
    public void helper(int[][] matrix, int left, int right, int top, int bottom){
        // Base case : If pointers cross each other terminate
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
        // We need to check top <= bottom because original position of top has increased
        if(top <= bottom){
              //Bottom row
            for(int i = right; i >= left; i--){
                result.add(matrix[bottom][i]);
            }
        }
        bottom--;
           // We need to check left <= right because original position of left has changed
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



//ITerative
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix==null || matrix.length == 0) return result;
        int m=matrix.length; int n = matrix[0].length;
        int top = 0; int bottom = m-1;
        int left = 0; int right = n-1;
        while(left <= right && top <= bottom){
            
            //top row
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            
            //going down
            //if(left <= right && top <= bottom){ no need to check this as only top is changing and for wont run
            for(int j=top;j<=bottom;j++){
                result.add(matrix[j][right]);
            }
            //}
            right--;
            //bottom left
            if(top <= bottom){
            for(int j=right;j>=left;j--){
                result.add(matrix[bottom][j]);
            }}
            bottom--;
            //left upwardds
            if(left <= right){
            for(int j=bottom;j>=top;j--){
                result.add(matrix[j][left]);
            }}
            left++;            
        }
        return result;
    }
}