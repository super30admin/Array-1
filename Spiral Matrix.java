// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result=new ArrayList<>();
        if(matrix==null || matrix.length==0) return result;
        int top=0; int bottom=matrix.length-1;
        int left=0; int right=matrix[0].length-1;
        
        while(left<=right && top<=bottom)
        {
            //top
            if(top<=bottom)
            {
            for(int i=left;i<=right;i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            }
            
            //right
            if(top<=bottom && left<=right)
            {
            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            }
            
            //bottom
            if(left<=right && top<=bottom)
            {
            for(int i=right;i>=left;i--)
            {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            //left
            if(top<=bottom && left<=right)
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
