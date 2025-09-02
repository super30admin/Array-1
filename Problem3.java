// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
Maintain 4 pointers left, right, top and bottom and keep track of elements
When we reach the boundries in right bottom left and top we shrink them accordingly
Do this until the pointers cross each other
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> li = new ArrayList<>();
        int left=0, right= n-1;
        int top = 0, bottom = m-1;

        //Recursion
        while(left <= right && top <= bottom) {
            //top row
            for(int j=left; j<= right; j++) {
                li.add(matrix[top][j]);
            }
            top++;
            //right column
            for(int i = top; i<=bottom; i++) {
                li.add(matrix[i][right]);
            }
            right--;
            
            //bottom row
            if (top <= bottom) {
                for(int j = right; j>=left ; j--) {
                li.add(matrix[bottom][j]);
            }
            bottom--;
            }
           
            //left column
            if (left <= right) {
                for(int i=bottom; i>=top; i--) {
                    li.add(matrix[i][left]);
                }
                left++;
            } 
        }
        return li; 
    }
}
