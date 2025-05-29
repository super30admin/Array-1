// Approach:
// Use four pointers (top, bottom, left, right) to define the current boundaries of the matrix and traverse the edges in a spiral order: 
  // -- left to right on the top row, 
  // -- top to bottom on the right column, 
  // -- right to left on the bottom row, and 
  // -- bottom to top on the left column. 
  // After traversing each edge, adjust the corresponding boundary inward and continue until all elements are visited. 
  // Conditional checks before traversing the bottom row and left column ensure no duplicates or invalid accesses occur when boundaries cross.

// Time Complexity: O(m * n), where m and n are the matrix dimensions, because each element is visited once.
// Space Complexity: O(m * n) 

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        int j=0;
        List<Integer> res = new ArrayList<>();
        while(left <= right && top <= bottom){
            // row left to right
            j=left;
            while(j <= right){
                res.add(matrix[top][j++]);
            }top++;
            // column -- top to bottom
            j=top;
            while(j <= bottom){
                res.add(matrix[j++][right]);
            }right--;
            //  row - right to left
            if(top <= bottom){
                j = right;
                while( j >= left){
                    res.add(matrix[bottom][j--]);
                } bottom--;
            }
            //  column - bottom to top
            if(left <= right){
                j = bottom;
                while( j >= top){
                    res.add(matrix[j--][left]);
                } left++;
            }
        }
        return res;
    }
}
