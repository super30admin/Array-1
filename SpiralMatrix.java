// Time Complexity : O(rowLength * columnLength)
// Space Complexity : O(1), no extra space otherthan result
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// we have to keep 4 pointers, say top, bottom, right, left. and start traversing top row from left to right and increment top so it is not visited again.
// do the same for other sides as well, traverse from top to bottom in right column, decrement right.
// traverse from right to left in bottom row, decrement bottom and so on.

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // can also be done using recursion

        // Time Complexity = O(rowLength * columnLength)
        // Space Complexity = O(1), no extra space otherthan result


        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        List<Integer> result = new ArrayList<>();


        // bounderies
        int left = 0;
        int right = columnLength - 1;
        int bottom = rowLength - 1;
        int top = 0;

        while( right >= left && bottom >= top){
            // top
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);
            }
            top++; // top row is done, increment

            // right
            if(left <= right){
                for(int i = top; i <= bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }


            // bottom
            if(bottom >= top){
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }


            // left
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
    }



}