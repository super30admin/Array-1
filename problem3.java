// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/* Consider 4 variables for top, bottom, left and right rows each. While iterating till the top pointer<=bottom and left<=right, 
Let us first print the top row of numbers from left to right.
After printing, we increment the top pointer to next row. Then we print the outermost right column, iterating from the top to bottom and decrement the right pointer.
Next, we print the bottom row, iterating from right to left and decrement the bottom pointer. 
Then, print the left column from bottom to top and increment the left pointer. 
Note: Check base condition before every snippet of code since we are modifying the base condition variables.
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> result=new ArrayList<>();
        int top=0; int bottom=m-1;
        int left=0; int right=n-1;
        
        while(top<=bottom && left<=right){
            //top row
            if(top<=bottom && left<=right){
                for(int j=left;j<=right;j++){
                    result.add(matrix[top][j]);
                    }
            }
            top++;
            //right column
            if(top<=bottom && left<=right){
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
            }
            right--;
            //bottom row
            if(top<=bottom && left<=right){
                for(int j=right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;
            //left row
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}