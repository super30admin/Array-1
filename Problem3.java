/* Spiral Matrix */

//Optimised solution-Iterative */
// Time Complexity : O(mn) where m is number of rows and n is number of columns
// Space Complexity : O(1) constant space as we are not using any recursive stack
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//Recursive approach
//We can use four pointers, all at the corners. Left, Right, Top, Bottom.
//Go from left ---> right on top row. Increase top row index.
//Go from top --> bottom on last column. Decrease right index.
//Go from right ---> left on bottom column. Decrease bottom pointer. Don't forget to make sure that top and bottom pointers have not crossed each other. Since top has moved in bullet 2.
//Go from bottom --> top. Increase left pointer. Don't forget to make sure that left and right pointers have not crossed each other. Since right has moved in bullet 3.
//The remaining matrix is subproblem of original matrix. Hence recurse/iterate till pointers are not crossing.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //initialise new arraylist to store result
        List<Integer> result = new ArrayList<>();
        //edge case
        if(matrix == null || matrix.length == 0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        //initialising pointers: top, bottom, left and right
        int top = 0;
        int bottom = m-1;
        int left = 0; 
        int right = n-1;

        //terminating condition
        while(left <= right && top <= bottom){
            //top row
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            //right column
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            //bottom row
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            //left column
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        } 
        return result;
    }
}