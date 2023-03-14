// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*We keep 4 pointers to check top, bottom, left and right. 
We increment and decrement them to make sure we don't repeat the same elements again and ahain. 
*/

public class Array3 {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
           List<Integer> res = new ArrayList<>();
           int m = matrix.length; 
           int n = matrix[0].length; 
           int top = 0; 
           int bottom = m - 1; 
           int left = 0; 
           int right = n - 1; 
           while(top <= bottom && left <= right){
               if(top <= bottom && left <= right){
               for(int i = left; i <= right;i++){
                   res.add(matrix[top][i]);
               }
               top++;
               }
               if(top <= bottom && left <= right){
               for(int i = top; i <= bottom;i++){
                   res.add(matrix[i][right]);
               }
               right--;
               }
            if(top <= bottom && left <= right){
               for(int i = right; i >= left;i--){
                   res.add(matrix[bottom][i]);
               }
               bottom--;
               }
                 if(top <= bottom && left <= right){
               for(int i = bottom; i >= top;i--){
                   res.add(matrix[i][left]);
               }
            left++;
               }
    
           }
           return res;
            }
             
        }
    
}
