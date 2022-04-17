import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(N)
// Space Complexity : O(1), No extra data structure used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class SpiralTraversal {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0 || matrix==null) return new ArrayList<>();

        List<Integer> result= new ArrayList<>();

        int top=0, bottom=matrix.length-1, left=0, right=matrix[0].length-1;

        while(top<=bottom && left<=right){
            //left to right
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                //right to left
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }


            if(left<=right){
                //bottom to top
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
