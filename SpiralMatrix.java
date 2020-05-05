// Time Complexity : O(n) where n is the number of elements 
// Space Complexity : O(n) for the output matrix where n is number of elements
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Additional element comes up when top crosses the bottom but we arent aware unless we check
/* Your code here along with comments explaining your approach: Keep four pointers: top, bottom, right, left. Increment the left to right pointer
on row. Then incremenet the right to bottom pointer on column. Decrement the right to left pointer on column and at last decrement the bottom
to top pointer. There are four loops. As one cycle completes, check with the next positions of the pointers supposed to be in spiral matrix. 
They follow the same pattern. Do check on the way if top and bottom or left and right have cross over.if yes, then stop.
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
          if ((matrix == null)||(matrix.length==0)){return new ArrayList<Integer>();}
        int top = 0, left = 0, bottom = matrix.length-1, right = matrix[0].length-1;
        ArrayList<Integer> result = new ArrayList<>();
        while(top<=bottom && left<=right){
        for(int i = left; i <=  right; i++){                            // Left to right visit
            result.add(matrix[left][i]);
        }
        top++;
        for(int i =  top; i <= bottom; i++){
            result.add(matrix[i][right]);                               // Top to bottom visit
        }
                
        right--;
        if(top<=bottom){                                                // Check if top and bottom have cross over else multiple print of same value
        for(int i = right; i >= left ;i--){
            result.add(matrix[bottom][i]);                              // Right to left visit
        }
        }
       bottom--;
        if(left<=right){                                                // left and right check for cross over
        for(int i = bottom; i >= top; i--){                             // Bottom to top visit
             result.add(matrix[i][left]);
        }
        }
        
        left++;                                                         // Adjusting the pointers for the next spiral cycle
        }
        return result;
    }
}