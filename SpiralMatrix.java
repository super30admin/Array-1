// Time Complexity : O(mXn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english No

// Your code here along with comments explaining your approach 

import java.util.*;

public class SpiralMatrix {

        public List<Integer> spiralOrder(int[][] matrix) {
    
            int m = matrix.length;
            int n = matrix[0].length;
    
            List<Integer> result = new ArrayList<>();
            //int r=0, c=0;
    
            int top = 0; int down=m-1;int left= 0; int right=n-1;
            while (top <= down && left <= right){
                for (int j=left;j<=right;j++){
                    result.add(matrix[top][j]);
                }
    
                top++;
    
                for (int j=top;j<=down;j++){
                    result.add(matrix[j][right]);
                }
                right--;
    
                if(top <= down){
                for (int j=right;j>=left;j--){
                    result.add(matrix[down][j]);
                }
                down--;
                }
    
                if(left <= right){
                for (int j=down;j>=top;j--){
                    result.add(matrix[j][left]);
                }
                left++;
                }
            }
            return result;
            
        }
    
    
}
