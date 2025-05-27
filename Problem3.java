//Problem 54 Spiral Matrix
//Time complexity : O(m*n) m is number of rows and n is number of columns
//Space Complexity : O(1) as we don't consider input and output array in calculating space used.
//Approach:Use four boundary pointers: top, bottom, left, right.
//Traverse in four directions: left to right (top row), top to bottom (right column),right to left (bottom row), and bottom to top (left column), updating boundaries after each pass.
// Continue the process while the boundaries do not cross.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>output = new ArrayList<>();
        int m = matrix.length;  //number of rows
        int n = matrix[0].length;  //number of columns
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right= n-1;
        while (left <= right && top <= bottom) {

            //traversing top row i.e.,from left to right
            for(int column = left ; column <= right ; column ++){
                output.add(matrix[top][column]);
            }
            top++;

            //traversing right column i.e., from top to bottom
            for (int row = top ; row <= bottom ; row++){
                output.add(matrix[row][right]);
            }
            right--;

            
            //traversing bottom row i.e., from right to left
            if (top <= bottom) {  // before going further to traverse the bottom row, check if it still exist.
            for(int column = right ; column >= left ; column --){
                output.add(matrix[bottom][column]);
            }
             bottom--;
            }

            //traversing left column i.e., from bottom to top;
            if (left <= right) { // before going further to traverse left column,check if it still exist.
            for(int row = bottom ; row >= top ; row--){
                output.add(matrix[row][left]);
            }
            left++;
            }
        }
        return output;


        
    }
}