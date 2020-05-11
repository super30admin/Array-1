// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YEs
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans= new int[nums.length];
        if(nums==null||nums.length==0)
            return null;
        int rp=1;
        int tp=1;
        for(int i=0;i<nums.length;i++)
        {
            rp=rp*tp;
            ans[i]=rp;
             tp=nums[i];
        }
        rp=1;
        for(int i=nums.length-2;i>=0;i--)
        {
             rp=rp*tp;
            ans[i]=ans[i]*rp;
             tp=nums[i];
        }
        return ans;
    }
}
---------------------------------------------------------------------------------------------------------------------------
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YEs
// Three line explanation of solution in plain english
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
    if(matrix==null||matrix.length==0)
        return new int[]{};
    int size=matrix.length*matrix[0].length;//Total number of elements in the matrix
        int[] ans= new int[size];
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int dir=1;
        int r=0;int c=0;
        while(i<m*n)
        {
            ans[i]=matrix[r][c];
            if(dir==1)
            {
                if(c==n-1)
                {
                    r++;
                    dir=-1;
                }
                else if(r==0)
                {
                    c++;
                    dir=-1;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else
            {
                if(r==m-1)
                {
                    c++;
                    dir=1;
                }
                else if(c==0)
                {
                    r++;
                    dir=1;
                }
                else
                {
                    r++;
                    c--;
                }
                    
            }
            i++;
        }
        return ans;
     
    }
}
-------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
    if(matrix==null||matrix.length==0)
        return new int[]{};
    int size=matrix.length*matrix[0].length;//Total number of elements in the matrix
        int[] ans= new int[size];
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int dir=1;
        int r=0;int c=0;
        while(i<m*n)
        {
            ans[i]=matrix[r][c];
            if(dir==1)
            {
                if(c==n-1)
                {
                    r++;
                    dir=-1;
                }
                else if(r==0)
                {
                    c++;
                    dir=-1;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else
            {
                if(r==m-1)
                {
                    c++;
                    dir=1;
                }
                else if(c==0)
                {
                    r++;
                    dir=1;
                }
                else
                {
                    r++;
                    c--;
                }
                    
            }
            i++;
        }
        return ans;
     
    }
}
----------------------------------------------------------------------------------------------------------------------
// Time Complexity :O(n) where n is the number of elements in the matrix
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YEs

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr= new ArrayList();
        if(matrix==null||matrix.length==0)
            return arr;
        
        int t=0;
        int l=0;
        int r=matrix[0].length-1;
        int b=matrix.length-1;
        
        while(l<=r&&t<=b)
        {
            for(int i=l;i<=r;i++)
            {    
            arr.add(matrix[t][i]);   
            }
            t++;
            for(int j=t;j<=b;j++)
            {
                arr.add(matrix[j][r]);
            }
            r--;
            if(t<=b)
            {
            for(int i=r;i>=l;i--)
                arr.add(matrix[b][i]);
            }
            b--;
            if(l<=r)
            {
            for(int i=b;i>=t;i--)
                arr.add(matrix[i][l]);
            }
                l++;
        }
        return arr;
    }
}