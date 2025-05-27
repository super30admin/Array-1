// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top=0, bottom=m-1, left=0, right=n-1;
        while(left <= right && top <= bottom){
            //top row
            for(int j=left; j<=right; j++){
                result.add(matrix[top][j]);
            }
            top++;
           
            //right column
            for(int i = top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right --;

            if(top<=bottom){
                    //bottom row
                for(int j=right; j>=left; j--){
                    result.add(matrix[bottom][j]);
            }
            bottom--;
            }
            
            if(left<=right){
                    //left column
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
            }
            left++;
            } 
        
        }
        return result;
    }
}