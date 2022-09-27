class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        
        
        ArrayList<Integer> al=new ArrayList<>();

        int top=0, right=n-1, bottom=m-1, left=0;
        
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
                al.add(matrix[top][i]);
            
            top++;
            
            for(int i=top;i<=bottom;i++)
                al.add(matrix[i][right]);
            
            right--;
            
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                    al.add(matrix[bottom][i]);
             
             
            }
            bottom--;           
            
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                    al.add(matrix[i][left]);             
                
            }
            left++;  
            
        }
        
        /*
        
                
        int idx=0;
        int r=0;int c=0;
        
        int dir=0;
        
        while(idx<m*n)
        {
            al.add(matrix[r][c]);
            idx++;
            System.out.println(idx);
            if(dir==0)
            {
                if(c==right-1)
                {
                    dir=1;
                    r++;
                    top++;
                }
                else
                    c++;
                
            } else if(dir==1)
            {
                if(r==bottom-1)
                {
                    dir=2;
                    c--;
                    right--;
                }
                else
                    r++;
                
            } else if(dir==2)
            {
                if(c==left+1)
                {
                    dir=3;
                    r--;
                    bottom--;
                }
                else
                    c--;
                
            } else{
                
                if(r==top+1)
                {
                    dir=0;
                    c++;
                    left++;
                }
                else
                    r--;
                
            }
        }*/
        
        return al;
    }
}

// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
