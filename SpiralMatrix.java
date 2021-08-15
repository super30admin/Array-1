// Time Complexity : O(M*N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {


        List<Integer> lst = new ArrayList();

        if(matrix==null || matrix.length==0)
        {
            return lst;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int top=0, bottom = m-1, left =0, right = n-1;

        while(top<=bottom && left<=right)
        {
            // left to right
            for(int i=left;i<=right;i++)
            {
                lst.add(matrix[top][i]);
            }
            top++;
            // increase the top
            //top to bottom

            if(top<=bottom && left<=right)
            {
                for(int i=top;i<=bottom;i++)
                {
                    lst.add(matrix[i][right]);
                }
                right--;
            }
            //decrease right;
            // right to left
            if(top<=bottom && left<=right)
            {
                for(int i=right;i>=left;i--)
                {
                    lst.add(matrix[bottom][i]);
                }
                // decrease bottom

                bottom--;
            }
            // bootom to top;
            if(top<=bottom && left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    lst.add(matrix[i][left]);

                }
                left++;
            }
        }

        return lst;

    }
}