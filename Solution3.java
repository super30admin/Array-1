// Leetcode Problem : https://leetcode.com/problems/spiral-matrix/description/
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int r = matrix.length,c=matrix[0].length;
        int top = 0,left=0,bottom=r-1,right=c-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                ans.add(matrix[top][i]);
            }
            top+=1;
            if(top<=bottom && left<=right)
            {
                for(int i=top;i<=bottom;i++)
                {
                    ans.add(matrix[i][right]);
                }
                right-=1;
            }
            if(top<=bottom && left<=right)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(matrix[bottom][i]);
                }
                bottom-=1;
            }
            if(top<=bottom && left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans.add(matrix[i][left]);
                }
                left+=1;
            }
        }


        return ans;
    }
}