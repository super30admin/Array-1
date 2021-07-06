import java.util.ArrayList;
import java.util.List;

// Time Complexity : o(mn)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix==null || matrix.length==0)
            return new ArrayList<>();
        
        List<Integer> result=new ArrayList<Integer>();
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int left=0,top=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        
        while(top<=bottom && left<=right)
        {
            //left to right
            for(int i=left;i<=right;i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            
            //top to bottom
            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            
            //right to left
            if(top<=bottom)
            {
              for(int i=right;i>=left;i--)
              {
                result.add(matrix[bottom][i]);
              }
               bottom--;
            }
            //bottom to top
            if(left<=right)
            {
            for(int i=bottom;i>=top;i--)
            {
                result.add(matrix[i][left]);
            }
            left++;
            }
        }
        return result;
    }
}
