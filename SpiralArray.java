// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// maintain four boundries of the matrix as top,bottom,left,right. print the outer sprial using for loops. then update the value of top,bottom,left,right 
// accordingly and execute the same loops with new boundaries. if at any point we are changing varible on which while loop is dependent, check those 
// conditions again before executing further.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int top = 0,bottom = matrix.length-1;
       int left = 0,right = matrix[0].length-1;
        List<Integer> result = new ArrayList<>();
        while(top<=bottom && left <= right){
            
            for(int i = left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            
            for(int i = top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom) {
            
            for(int i = right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            }
            bottom--;
            if(left<=right) {
            
            for(int i = bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            }
            left++;
            
        }
        return result;
    }
}
