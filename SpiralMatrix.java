// Time Complexity : O(mxn) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    
        //time: O(mxn)
        //space: O(1)
        public List<Integer> spiralOrder(int[][] matrix) {
            
            int m= matrix.length;
            int n = matrix[0].length;
            List<Integer> result = new ArrayList<Integer>();
            if(matrix == null || matrix.length == 0) return result;
            int left = 0;
            int right = n-1;
            int top = 0;
            int bottom = m-1;
            
            while(left<=right && top<=bottom){
                if(top<=bottom){ 
                for(int j=left; j<=right; j++){
                    result.add(matrix[top][j]);
                }
                top++;
                }
                if(left<=right){ //Need to keep checking for the while condition cause it can stop being true after the for loops and won't be checked again until the entire while loop is done 
                for(int i=top; i<=bottom; i++){
                    result.add(matrix[i][right]);
                }
                right--;
                }
                if(top<=bottom){
                for(int j=right; j>=left; j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
                }
                if(left<=right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
                }
            } return result;
        }
    
}
