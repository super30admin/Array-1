// Time Complexity : O(2n)
// Space Complexity : O(n+n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Comments 

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0)
            return nums;
        
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        
        int temp=1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                left[i]=1;
                temp=nums[i];
            }
            else
            {
                left[i]=temp*left[i-1];
                temp=nums[i];
            }  
        }
        temp=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i==nums.length-1)
            {
                right[i]=1;
                temp=nums[i];
            }
            else
            {
                right[i]=temp*right[i+1];
                temp=nums[i];
            }  
        }
        
        for(int i=0;i<nums.length;i++)
            left[i]=left[i]*right[i];
            
        return left;
    }
}