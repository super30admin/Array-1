//check for recursive method.

//TC : O(m*n)
//SC : O(1) 

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top =0, bottom = m-1, left =0, right = n-1;

        List<Integer> result = new ArrayList<>();
        while(top<=bottom && left<= right){
            for(int i = left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            //no need to check condition here, above code is take care of top mutation
            // if(top<=bottom && left<= right){
                for(int i = top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
            right--;
            // }
            if(top<=bottom && left<= right){
                for(int i =right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
            bottom--;
            }
            // if(top<=bottom && left<= right){ // inside the loop is taking care of top and bottom check
            if(left<= right){
                for(int i= bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
            left++;
            }
            
        }

     return result;  
        
    }
}