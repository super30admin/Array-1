// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: Traverse the matrix in a spiral order by maintaining boundaries and moving in four directions (right, down, left, up) while adjusting the boundaries after each direction.

// Your code here along with comments explaining your approach: Initialize four pointers (top, bottom, left, right) to represent the current boundaries of the matrix. Used a while loop to traverse the matrix until the pointers cross each other. In each iteration, traverse in the current direction (right, down, left, up) and adjust the corresponding pointer after traversing. Continue this process until all elements are added to the result list in spiral order.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m-1, l = 0, r = n-1;

        List<Integer> result = new ArrayList<>();

        while(top <= bottom && l <= r){

            for(int i=l; i<=r; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++)
            {
                result.add(matrix[i][r]);
            }
            r--;
          
            if(top <= bottom)
            {
                for(int i=r; i>=l; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(l <= r)
            {
                for(int i=bottom; i>=top; i--)
                {
                    result.add(matrix[i][l]);
                }
                l++;
            }
        }

        return result;
    }
}
