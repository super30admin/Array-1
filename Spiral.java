// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        while(left<=right && top<=bottom){
            //left to right
            for(int j=left;j<=right;j++){
                list.add(matrix[top][j]);
                }
            top++;  
           
            //top to bottom
            if(left<=right){
                for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            } 
            }
             
            right--;
            //right to left
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                list.add(matrix[bottom][j]);
            }
            }
            
            bottom--;
            //bottom to top
            if(left<=right){
                 for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            }
           
            left++;
        }
        return list;
    }
}