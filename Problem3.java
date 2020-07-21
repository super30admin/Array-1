// Time Complexity : O(n*m)
//      n: number of rows
//      m: number of columns
// Space Complexity : O(1)
//      Use the input matrix
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        // result array
        List<Integer> result = new ArrayList<>();
        if(matrix==null || matrix.length==0)
            return result;
        
        // intial boundary
        int up = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        // if it is within bound
        while(checkBound(up, down) && checkBound(left, right)){
            
            // from left to right
            for(int i=left; i<=right; i++)
                result.add(matrix[up][i]);

            // decreasing bound of up
            up++;
            
            // check bound
            if (!checkBound(up, down))
                break;
            
            // from up to down
            for(int i=up;i<=down; i++)
                result.add(matrix[i][right]);

            //decrease right bound
            right--;
            
            // check bound
            if (!checkBound(left, right))
                break;
            
            //from right to left
            for(int i=right;i>=left; i--)
                result.add(matrix[down][i]);

            // decrease down bound
            down--;
            
            // check bound
            if (!checkBound(up, down))
                break;
            
            // from down to up
            for(int i=down;i>=up; i--)
                result.add(matrix[i][left]);
            
            // decrease left bound
            left++;  
        } 
        // return result
        return result; 
    }
    
    /**
     * Returns true if start is less than equal end
     * @param start int
     * @param end   int
     * @return boolean
     */
    private boolean checkBound(int start, int end){
        return start <= end;
    } 
}