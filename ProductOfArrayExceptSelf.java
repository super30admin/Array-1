// Time Complexity : O(n) where n is the number of elements in the array
// Space Complexity : O(1) since we are not using any auxillary data structures
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int rp=1;
        res[0]=rp;
        for(int i =1;i<nums.length;i++)
        {   rp = rp*nums[i-1];
            res[i]=rp;
         
        }
        
        rp=1;
        
        for(int i=nums.length-2;i>=0;i--)
        {   rp= rp*nums[i+1];
            res[i]*=rp;
         
        }
            
            return res;
    }
}