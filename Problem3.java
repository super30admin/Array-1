//Spiral Matrix

// Time Complexity : O(m*n) - m is the number of rows and n is the number of columns
// Space Complexity : O(1) - no extra space used

// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//Keep 4 pointers top,bottom,left and right and print the elements according to the pattern.
// Note that once you increment the pointer in the loop , see to that you check that the incremented values don't shoot above the limit.

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();

        if(matrix == null || matrix.length == 0){
            return result;
        }

        int top = 0;
        int bottom = matrix.length -1;
        int left = 0;
        int right = matrix[0].length -1;
        // System.out.println("right"+right);

        while(left<=right && top <=bottom){
            //top row
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            //right side
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            //bottom row
            if(top<=bottom){

                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }


            //left side
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;

        }

        return result;
    }

}