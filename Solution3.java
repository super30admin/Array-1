import java.util.List;

// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
 * I have maintained 4 variables - top,bottom,left and right to print top row, right column, bottom row and left column respectively.
 */
class Solution3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;

        int top =0;
        int left=0;
        int right = columns-1;
        int bottom = rows-1;

        while(top<=bottom && left<=right)
        {
            //top row
            for(int i=left;i<=right;i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;
            //right column
            if(top<=bottom && left<=right)
            {
                for(int i=top;i<=bottom;i++)
                {
                    ans.add(matrix[i][right]);
                }
                right--;
            }
            //bottom row
            if(top<=bottom && left<=right)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //left column
            if(top<=bottom && left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans; 
    }
}