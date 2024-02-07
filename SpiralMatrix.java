//The algorithm performs a spiral order traversal of a 2D matrix, adding elements to the result list res in a clockwise direction. 
//It uses four pointers (left, right, top, and bottom) to define the boundaries of the current layer. 
//The traversal includes four steps: top row, right column, bottom row, and left column, adjusting the pointers after each step. 
//The time complexity is O(m * n), where m and n are the number of rows and columns in the matrix, and the space complexity is O(1) .
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int right = n-1, left =0, top =0, bottom = m-1;
       while(left<= right && top<= bottom){
           // top row
           for(int j=left;j<= right; j++){
               res.add(matrix[top][j]);
           }
           top++;
           //right col
           for(int j=top;j<= bottom; j++){
               res.add(matrix[j][right]);
           }
           right--;
           //bottom
           if(left<= right && top<= bottom){
            for(int j=right;j>=left; j--){
               res.add(matrix[bottom][j]);
           }
           bottom--;
           }
           //left col
           if(left<= right && top<= bottom){
            for(int j=bottom;j>=top; j--){
               res.add(matrix[j][left]);
           }
          left++;
           }

       }
        return res;
    }
}