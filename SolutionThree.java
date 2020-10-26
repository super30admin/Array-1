// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
class SolutionThree {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result=new ArrayList<Integer>();

        if(matrix==null||matrix.length==0)
            return result;

        int left=0, right=matrix[0].length-1;
        int top=0, bottom=matrix.length-1;

        while(left<=right&&top<=bottom)
        {
            if(left<=right&&top<=bottom)
            {
                for(int i=left;i<=right;i++)
                    result.add(matrix[top][i]);
            }
            top++;

            if(left<=right&&top<=bottom)
            {
                for(int i=top;i<=bottom;i++)
                    result.add(matrix[i][right]);
            }
            right--;

            if(left<=right&&top<=bottom)
            {
                for(int i=right;i>=left;i--)
                    result.add(matrix[bottom][i]);
            }

            bottom--;

            if(left<=right&&top<=bottom)
            {
                for(int i=bottom;i>=top;i--)
                    result.add(matrix[i][left]);
            }

            left++;

        }

        return result;

    }
}