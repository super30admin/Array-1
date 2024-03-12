// Time Complexity : O(n * m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// we've taken 4 variables to traverse thru the matrix in top, bottom, left and right 
//directions and were keeping track of either traversinng in the boundry or the internal
// part of the spiral 

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        while(left <= right && top <= bottom){
            //top row
            for(int j=left; j <= right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            //right column
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            //bottom row
            if(left <= right && top <= bottom)
            for(int j = right; j >= left; j--){
                result.add(matrix[bottom][j]);
            }
            bottom--;

            //left column
            if(left <= right && top <= bottom)
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }
}