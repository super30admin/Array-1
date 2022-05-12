     // Time Complexity :O(m*n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> out=new ArrayList<>();
        int r=matrix.length-1;//tsking the indexes
        int c=matrix[0].length-1;
        int top=0,bottom=r,left=0,right=c;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                out.add(matrix[top][i]);
            }
            top++;
            if(right>=left){
            for(int i=top;i<=bottom;i++)
            {
                out.add(matrix[i][right]);
            }
            right--;
            }
            if(top<=bottom){
            for(int i=right;i>=left;i--)
            {
                out.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(right>=left){ //check for right and left
            for(int i=bottom;i>=top;i--) //here top and bottom pointers are taken care of
            {
                out.add(matrix[i][left]);
            }
            left++;
            }
        }
        return out;
    }