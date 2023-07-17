// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length; //rows
        int m = matrix[0].length; //columns
        List<Integer> list = new ArrayList<>();

        int top = 0, bottom = n-1, left = 0, right = m-1;

        while(top<=bottom && left<=right) {

            //Traverse top row
            for(int i =left; i<=right;i++){
                list.add(matrix[top][i]);
            }
            
            top++;

            //traverse rightmost column
            for(int i =top; i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            
            right--;

            //Traverse bottom row
            //validate the boundry condition again
            if(top<=bottom){
                for(int i =right; i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom --;
            }

            //Traverse left column
            //validate the boundry condition again
            if(left<=right){
                for(int i = bottom; i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

            }

            return list;
    }
}
