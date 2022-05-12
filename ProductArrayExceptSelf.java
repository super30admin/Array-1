// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out=new int[nums.length];
        //finding the left product
        int result=1;
        out[0]=result;
        for(int i=1;i<nums.length;i++)
        {
            result=result*nums[i-1];
            out[i]=result;
        }
        //for finding the right pointer
        result=1;
        // no need to do for last element because it only has left product
        for(int i=nums.length-2;i>=0;i--)
        {
            result*=nums[i+1];
            out[i]=out[i]*result;
        }
        return out;
        
    }
}