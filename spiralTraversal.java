/**Time Complexity: O(m*n) where m is the number of rows and n is the number of columns in the matrix.
 * Space Complexity: O(1) - output array is not counted
 * Did this program successfully run on Leetcode: Yes
 * Any problem you faced while coding this: No
 */

/**
 * The top, bottom, left, and right variables are used to keep track of the boundaries of the current spiral layer.
 * Here, we are mutating the boundaries as we traverse within the current spiral. Hence, we need to check each time before traversing in a different direction within the current spiral if the boundaries are still valid.
 * Once we reach the boundaries that are no longer valid, we return the result array.
 */


import java.util.ArrayList;
import java.util.List;
class spiralTraversal {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;

        int top=0;int bottom=m-1;int left=0;int right=n-1;
        while(top<=bottom && left<=right)
        {
            for (int i=left;i<=right;i++)
            {
                result.add(matrix[top][i]);
                
            }
            top++;
            
            for (int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
                
            }
            right--;

            if(top<=bottom)
            {
                for (int i=right;i>=left;i--)
                {
                result.add(matrix[bottom][i]);
                
                }
                bottom--;
            }
            if(left<=right)
            {
                for (int i=bottom;i>=top;i--)
                {
                    result.add(matrix[i][left]);
                
                }
                left++;
            }
        }
       return result; 
    }
}