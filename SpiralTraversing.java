class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //edge case
        if( matrix == null || matrix.length == 0) return new ArrayList();//0; //new int[0];
        //what all I need
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0; int bottom = m-1; int right = n-1;int left = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();  
       while(top<= bottom && left <= right) {//dont breach base condition
         
           //left to right
           for(int i = left;i<=right ;i++){
               result.add(matrix[top][i]);
           }
           top++;
         
        //top to bottom
           for(int i = top ;i<= bottom ;i++){
               result.add(matrix[i][right]);
           }
           right--;
          if(top <= bottom ){
           //right to left
           for(int i = right ;i >= left ;i--){
               result.add(matrix[bottom][i]);
           }}
           bottom--;
           //base condition breach probability higher
             if(left <= right){
           //bottom to top
           for(int i = bottom ;i>= top;i--){
               result.add(matrix[i][left]);
           }
            }
           left++;
    }
        return result;
}
}

/*
Time complexity O(mxn)
Space complexity O(1) input  is outputed not used in computation
*/