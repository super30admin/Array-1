// Time Complexity :O(n) n-length of the array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this : -
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        
        int prod=1;
        for(int i=0;i<nums.length;i++)
        {
             result[i]=prod;
             prod*=nums[i];
        }
        prod=1;
         for(int i=nums.length-1;i>=0;i--)
        {
             result[i]*=prod;
             prod*=nums[i];
        }
        return result;
    }
}

