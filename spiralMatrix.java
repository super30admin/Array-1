class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m= matrix.length;
        int n=matrix[0].length;
        List<Integer> result = new ArrayList<>();

        int left=0; int right=n-1;
        int top=0; int bottom=m-1;
        
        
        while(top<=bottom && left <= right ){
            //top row
            for(int j=left; j<=right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            
            //right col
            if(top<=bottom && left <= right){
                
                for(int i=top; i<= bottom; i++){
                    result.add(matrix[i][right]);
                }
            }
            right--;
            //bottom row
            if(top<=bottom && left <= right){
                
                for(int j=right; j>= left; j--){
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;
            //left col
            if(top<=bottom && left <= right){

                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;

        }
        
        return result;
    }
}
