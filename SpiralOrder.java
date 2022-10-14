// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        List <Integer> result=new ArrayList<>();
      
        while(top<=bottom && left<=right){
            //top row
            if(top<=bottom && left<=right){
                for(int i=left;i<=right;i++){
                    result.add(matrix[top][i]);
                }
            }
            top++;
            
            //right row
            if(top<=bottom && left<=right){
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
}
            right--;
            
            //bottom row
            if(top<=bottom && left<=right){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            
            //left row
            
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return result;
    }
}