//time complexity: O(n)
//space complexity: O(n)


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int top=0, left=0,right=matrix[0].length-1,bottom=matrix.length-1;
        int i,dir=0;
        try{
        
        while(top<=bottom && left<=right)
        {
            if(dir==0)
            {
                for(i=left;i<=right;i++)
                    ans.add(matrix[top][i]);
                top++;
            }
            else if(dir==1)
            {
                for(i=top;i<=bottom;i++)
                    ans.add(matrix[i][right]);
                right--;
            }
            else if(dir==2)
            {
                 for(i=right;i>=left;i--)
                    ans.add(matrix[bottom][i]);
                bottom--;
            }
            else if(dir==3)
            {
                for(i=bottom;i>=top;i--)
                    ans.add(matrix[i][left]);
                left++;
                
            }
            dir=(dir+1)%4;
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return ans;
    }
}