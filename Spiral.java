// Time Complexity : O(mn)
// Space Complexity : O(1) in case of recursion will be O(min(m,n)/2)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//In this approach we maintain top, bottom, left and right pointers to change the rows and column for each iteration.
//We start from the top layer and we add that to the answer list. We increment the top and add the right layer and decrement the right pointer.
//Then we add bottom layer and add it followed by decrementing the bottom. We add the left layer and decrement the left. All the pointers now 
//point to the second inner spiral and we can repeat the whole process. We finally return the resultant list.

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)return new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        while(top<=bottom && left<=right){
            //top
            for (int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            //right
        
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            //bottom
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                result.add(matrix[bottom][j]);
            }
            }
            bottom--;
            //left
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
