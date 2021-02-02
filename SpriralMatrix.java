// Time Complexity :O(n*2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//We have 4 pointers top ,bottom ,left, right,  we will manupulate this pointers based on the direction we have to travel
// We can have 4 directions to be able to travel in spiral form. There is seperate for-loop for each direction we want to move


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<Integer>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);  
            }
            top++;
            
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
        return list;
    }
}