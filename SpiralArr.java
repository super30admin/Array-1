// Time Complexity : O(m*n)
// Space Complexity : O(1) , we dont count output in space complexity
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Have four variables to shrink the traversal length after each loop to traverse through the spirals.

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0 ; int left = 0 ; int right = n-1; int bottom = m-1;

        List<Integer> result = new ArrayList<>();

        while( top <= bottom && left <= right){
            //top row
            for(int i = left ; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++; //top row done

            //right col
            for(int i = top ; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--; // right col done
            
            // since our base condition is changing during the loop, we need to check it again.
            if(top <= bottom){
                //bottom row
                for(int i = right ; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if( left <= right){
                //left row
                for(int i = bottom ; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
        }

        return result;
    }
}