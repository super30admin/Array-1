Problem 238-(Product of array except self)

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution
{
    public int[] productExceptSelf(int[] nums)
    {
        int len=nums.length;
        int[] arr=new int[len];
        if(nums.length==0 || nums==null) return arr;
        
        //creating left pass multiplication
        arr[0]=1;
        for(int i=1; i<len; i++)
        {
            arr[i]=arr[i-1]*nums[i-1];
        }

        //creating right pass multiplication using temp variable
        int temp=1;
        for(int j=len-2;j>=0;j--)
        {
            temp=temp*nums[j+1];
            arr[j]=temp*arr[j];
        }
        return arr;
    }
}





Problem 498-(Diagonal Traverse)

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Three line explanation of solution in plain english
    
    
    
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] result=new int[m*n];
        int i=0,j=0,k=0;
        //result[0]=mat[0][0];
       
        //even
        while(i<=m-1 && j<=n-1)
        {
            if((i+j) %2==0)
            {
                result[k]=mat[i][j];
                k++;
                
                if(j+1==n && i-1<=0){
                    i++;
                }
                else if( j+1>n || i-1<0 )
                {
                    
                    j++;
                }
                else
                {
                    j++;
                    i--;
                }
            }
            else
            {
                result[k]=mat[i][j];
                k++;
                
                if(i+1==m && j-1<=0)
                {
                    j++;
                }
                else if(i+1>m || j-1<0)
                {
                    i++;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}
