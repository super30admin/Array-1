// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Here we are using four pointers to rotate over metrix and check for boundry condition.

class SpiralMatrix{
    
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list = new ArrayList<Integer>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0;
        int top = 0;
        int bottom = m-1;
        int right = n-1;

        while(left<=right && bottom >= top){
            //top 
            for(int j=left; j <= right; j++){
                list.add(matrix[top][j]);
            }top++;
            
            //right
            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            } right--;

            //bottom
            if(top <= bottom){ // we need to check pointer here.
                for(int j = right; j >= left ; j-- ){
                list.add(matrix[bottom][j]);
            }
            }bottom--;
            //left
            if(left<=right){ // we need to check pointer here.
            for(int i= bottom; i>= top; i--){
                list.add(matrix[i][left]);
            } 
            }left++;

        }
        return list;

    }
}