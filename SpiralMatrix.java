// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// Take four variables to track the traversal through the matrix.
// Add the elements to the result list by traversing from left to right, top to bottom, right to left and bottom to top.
// Update the tracking variables to avoid already visited elements.


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0,right=n-1,top=0,bottom=m-1;
        List<Integer> result=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            }
            
        }
        return result;
    }
}