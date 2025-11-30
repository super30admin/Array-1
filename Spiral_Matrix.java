// Time Complexity : O(m * n) -> To traverse m * n elements in given matrix
// Space Complexity : O(1) -> Constant space. The output array/list created is returned as output so not considered as extra space 
// Did this code successfully run on Leetcode : Yes
// We are traversing the matrix in spiral order by maintaining four pointers - top, bottom, left and right. We traverse the matrix in four directions - left to right, top to bottom, right to left and bottom to top and update the pointers accordingly until all elements are traversed

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Base condition
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<>();
        }

        // 1. Create output Array
        List<Integer> output = new ArrayList<>();
        
        // 2. Length of rows and columns
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns

        // 3. Initialize the pointers 
        int top = 0; int left = 0;
        int bottom = m - 1; int right = n - 1;

        // 4. Traverse the matrix elements in spiral order and store in output list
        while(top <= bottom && left <= right){
            // top row: left -> right
            // No need to check for top, bottom or left, right bounds as we just checked. So no IF condition added here
            for(int x = left; x <= right; x++){
                output.add(matrix[top][x]);
            }
            top++;

            // right column: top -> bottom
            // No need for (top <= bottom) condition as its getting checked in for loop. No need for (left <= right) as no change in left, right pointers yet
            for(int x = top; x <= bottom; x++){
                output.add(matrix[x][right]);
            }
            right--;

            // bottom row: right -> left
            // We need (top <= bottom) condition here, as top pointer is changed above. No need for (left <= right) as its being checked in for loop
            if(top <= bottom){
                for(int x = right; x >= left; x--){
                    output.add(matrix[bottom][x]);
                }
                bottom--;
            }

            // left column: bottom -> top
            // We need (left <= right) condition here, as right pointer is changed above. No need for (top <= bottom) as its being checked in for loop
            if(left <= right){
                for(int x = bottom; x >= top; x--){
                    output.add(matrix[x][left]);
                }
                left++;
            }
        }

        // 5. Return the output array/list
        return output;

    }

}