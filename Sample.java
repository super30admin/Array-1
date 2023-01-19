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
