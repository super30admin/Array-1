// Time Complexity : O(m*n) where m is the number of rows and n is the number of columns
// Space Complexity : O(1) - output array is not considered for space complexity
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/* https://leetcode.com/problems/spiral-matrix/ */
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        //null check
        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();

        int m = matrix.length; //row size
        int n = matrix[0].length; //column size

        int left = 0;
        int right = n-1;

        int top = 0;
        int bottom = m-1;

        List<Integer> result = new ArrayList<>();

        while(top <= bottom && left <= right){

            //top wall
            for(int j = left ; j <= right ; j++){
                result.add(matrix[top][j]);
            }
            top++;

            //right wall
            for(int i = top ; i <= bottom ; i++){
                result.add(matrix[i][right]);
            }
            right--;

            //bottom wall
            if(top <= bottom){
                for(int j= right ; j >= left ; j--){
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;

            //left wall
            if(left <= right){
                for(int i = bottom ; i >= top ; i-- ){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}