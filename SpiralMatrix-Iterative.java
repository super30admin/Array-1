//Problem 28 : Iterative - Spiral Matrix
// Time Complexity : O(n*m), where n & m are rows and columns
// Space Complexity : (O(1)), because extra array is the output array which is not auxillary
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach 
/*
  Steps:
  1) Use 4 pointers concept
     top = 0, bottom = last row, left first column, right = last column
  Note: Keep in mind u r traversing boundary and then squeezing the matrix for traversing inside boundaries
  2) First traverse for top from left to right. Once reached right, increment top by 1;
  3) Second traverse for the last column, start from top to bottom. Once reached bottom decrease right by 1 because u r not going to traverse it again.
  4) Third traverse for the last row,traverse from right to left and then decrease bottom row pointer by 1
  5) Fourth traverse for the first column, traverse from bottom to top and then increase the left pointer by 1.
  6) Repeat above steps till top<=bottom and left<=right
*/


import java.util.*;

class Solution28Iterative {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<>();
        
        if(matrix==null || matrix.length==0){
            return res;
        }
        
        int top=0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        while(top<=bottom && left<=right){//we are squeezing the matrix traversal on each while loop completion
            
            //for top row traversal
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);//-->col changing
            }
            top++;
            
            //for last column traversal
               for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);//-->row changing
               }
            right--;    
            
            
            
            //for bottom row traversal
            if(top<=bottom){//there could be a possibility if top became greater than the bottom by above written top++;
                for(int i=right;i>=left;i--){
                res.add(matrix[bottom][i]);//-->col changing
               }
               bottom--;    
            }
            
            
            //for first column traversal from bottom towards top
            if(left<=right){//there could be a possibility if right became smaller than the left by above written right--;
                  for(int i=bottom;i>=top;i--){
                    //System.out.println("Bottom "+bottom +"Top "+top+" Left "+left);
                    res.add(matrix[i][left]);//-->row changing
                 }
                left++;
            }
            
        }
        return res;
    }
}