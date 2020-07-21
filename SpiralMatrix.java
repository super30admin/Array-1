/**
Problem: Spiral Matrix
Time Complexity : O(m*n), where m is the number of rows, n is the number of columns of the given matrix.
Space Complexity : O(1), as we are just returning the result list and not creating an additional space for the purpose of solving.
(In class, we were told that in most cases, result list that we are asked to return is considered to have a space complexity of O(1)).
Did it run on leetcode : Yes

Approach: Using pointers for top, bottom, left and right
1. While traversing thru the matrix, we keep updating the pointers, and check that the crossovers don't happen.
2. While traversing from left to right, we keep appending them to our result list, however, when we reach the right most element, we traverse down.
3. While traversing from top to bottom, we keep appending them to our result list, however, when we reach the bottom most right element, we traverse left.
4. While traversing from right to left, we keep appending them to our result list, however, when we reach the bottom most left element, we traverse to the top.
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) { 
        List result = new ArrayList();
        if(matrix == null || matrix.length == 0) 
            return result;
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0, top = 0;
        int right = n-1, bottom = m-1;
        //result.add(matrix[0][0]);
        int count = 0; //count is used to keep a track of direction of traversal
        while(left<=right && top<=bottom) {
            if(count == 0) {
                for(int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
              }
                top++;
                count = 1; 
            }
            
            else if(count == 1) {
                for(int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
                count = 2;
            } 
            else if(count == 2) {
                for(int i = right; i>=left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
                count = 3;
            }
            else if(count == 3) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
                count = 0;
            }
        }
        return result;
    }
}