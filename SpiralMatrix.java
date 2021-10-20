// Time Complexity :O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
        char direction='R';
       List<Integer> result=new ArrayList<>();
        int top=0;
        int left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        
       while(left<=right && top<=bottom){
           for(int i=left;i<=right;i++){
               result.add(matrix[top][i]);
           }
           top++;
           
           for(int i=top;i<=bottom;i++){
               result.add(matrix[i][right]);
           }
           right--;
           if(top<=bottom){
           for(int i=right;i>=left;i--){
               result.add(matrix[bottom][i]);
           }
           bottom--;
           }
           
           if(left<=right){
           for(int i=bottom;i>=top;i--){
               result.add(matrix[i][left]);
           }
           left++;
           }
       }
        
        return result;
    }
}
