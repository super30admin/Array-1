// Time Complexity : O(N) where N=m*n 
// Space Complexity : O(n*m)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
1. Use Interative method
2. On printing top row increment 'top' so we don't cover it again.
2. On printing right row decrement 'right' so we don't cover it again.
2. On printing bottom row decrement 'bottom' so we don't cover it again.
2. On printing left row increment 'left' so we don't cover it again.
*/

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0; int bottom = n-1;
        ArrayList<Integer> finalArr = new ArrayList<Integer>();
        int left = 0;
        int right = m-1;
        
        while(left<=right && top <= bottom){   
            for(int i=left;i<=right;i++) {
                finalArr.add(matrix[top][i]);
            }
            top++;
            if(left<=right && top <= bottom) {
                for(int i=top;i<=bottom;i++) {
                    finalArr.add(matrix[i][right]);
                }
            }
            right--;
            if(left<=right && top <= bottom) {   
                for(int i=right;i>=left;i--) {
                    finalArr.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left<=right && top <= bottom) {
                for(int i=bottom;i>=top;i--) {
                    finalArr.add(matrix[i][left]);
                }
            }
            left++;
        }
        return finalArr;
    }
}
