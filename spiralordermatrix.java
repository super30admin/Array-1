
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n= matrix[0].length;
        int m=matrix.length;
        List<Integer> result = new ArrayList<>();
        
        //setting directions
        int left = 0; 
        int right = n-1;
        int top=0;
        int bottom = m-1;
        while(left<=right && top<=bottom){
            //top row of the magtrix
            for(int j=left; j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            
            //right column of the matrix
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            //bottom row of the matrox
            for(int j= right; j>=left;j--){
                result.add(matrix[bottom][j]);
             }
             bottom--;
            
            //left column of the matrix
            for(int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
            left++;      
    }
       return result;
    }
}