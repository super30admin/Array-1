//Time Complexity : O(m*n)
//space Complexity : O(1)
//Note:Instead of checking for within bound condition, it can be checked whether the resultant array is going above length m*n 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0){
            return new ArrayList<>();
        }
        //declare four pointers to change the direction
        int row = matrix.length-1, col = matrix[0].length-1;
        int top=0, bottom = row;
        int left=0,right = col;
        List<Integer> result = new ArrayList<>();
        //iterate through the matrix until the pointers dont cross each other
        while(top<=bottom && left<=right){
            //go from left to right. This is done by moving the left in the same row
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            //to move to next rows inc the top 
            top++;
            //check if right and left are not crossing the bounds
           if(left<=right){
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
            }
            //now move from right to left
            right--;
            //check if top and bottom are within bounds
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            }
            //move from bottom to top
            bottom--;
            //check if top and bottom are within bounds
            if(left<=right) {
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            }
            left++;
        }
        
        return result;
    }
}