//Time complexity=O(M*N)
//Space complexity=O(M*N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Here we are keeping 4 pointer that are left, right, top & down(or bottom).As we traverse the matrix we change the values of the pointer and use these pointer as endpoints to traverse in specified distance, so we don't repeat the number of matrix.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0 || matrix==null)
            return new ArrayList<>();
        int n=matrix[0].length,m=matrix.length;
        int count=0,left=0,right=n-1,top=0,down=m-1;
        List<Integer> result=new ArrayList<>();
        while(left<=right && top<=down)
        {
            for(int i=left;i<=right;i++)
            {   
                result.add(matrix[top][i]);
            }
            top++;
            if(left>right || top> down) //We are checking for cross over of top & down and left & right in the for loop.
                break;
            for(int i=top;i<=down;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            if(left>right || top>down)
                break;
            for(int i=right;i>=left;i--)
            {
                result.add(matrix[down][i]);
            }
            down--;
            for(int i=down;i>=top;i--)
            {
                result.add(matrix[i][left]);
            }
            left++;
            
        }
        return result;
    }
}