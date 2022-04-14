//TC : O(n) SC: O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0) return new int[]{};
        int rp = 1;

        int[] result = new int[nums.length];
        result[0] = 1;

        for(int i=1;i<nums.length;i++)
        {
            rp = rp*nums[i-1];
            result[i] = rp;
        }

        rp=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            rp=rp*nums[i+1];
            result[i] = result[i]*rp;
        }

        return result;

    }
}