// Time Complexity : O(mn)
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 * Keep four pointers to track all four boundaries
 * Shrink boundaries once the elements are picked
 * Consider edge case where we dont want to pick already picked elements again
 */

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        //four pointers
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while(top <= bottom && left <= right){
            //move from left to right
            for(int i = left; i <= right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            // move from top to bottom
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            // move from right to left
            //if the pointers are crossed, we dont to pick the element again
            if(top <= bottom)
            {
                for(int i = right; i >= left; i --){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // move from bottom to top
            //if the pointers are crossed, we dont to pick the element again
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}