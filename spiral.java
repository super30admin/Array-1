/Time Complexity : O(n)
//Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList();
        int top=0;
        if(matrix.length == 0 || matrix[0].length == 0) return list;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int left=0;
        while(left <= right || top <= bottom)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[top][i]) ;   //top is the row index
            }
            
            top=top+1; //top is 2
            if(left > right || top > bottom) break;
            
            
            for(int i=top;i<=bottom;i++) //bottom is 1 so not executed second time
            {
                list.add(matrix[i][right]);
            }
            right=right-1;
            if(left > right || top > bottom) break;
            for(int i=right;i>=left;i--)
            {   
                list.add(matrix[bottom][i]);
            }
            if(top>bottom || right<left) break;
            bottom=bottom-1;
            for(int i=bottom;i>=top;i--)
            {
                list.add(matrix[i][left]);
            }
            left=left+1;
            if(left > right || top > bottom) break;
        }
        return list;
    }
}