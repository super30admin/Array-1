// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0||nums==null) return new int[0];
        int[] result=new int[nums.length];
         int factor=1;  int fact=1;
        
        for(int i=0;i<nums.length;i++)
        {
            result[i]=factor;
            factor*=nums[i];    
        }
        
        for(int i=nums.length-1;i>=0;i--)
        {
            result[i]*=fact;
            fact*=nums[i];
        }
        return result;
    }
}
