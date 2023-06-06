//Time Complexity o(n) Space complexity o(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int rp=1;
        res[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            rp=rp*nums[i-1];
            res[i]=rp;
        }
        rp=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            rp=rp*nums[i+1];
            res[i]=res[i]*rp;
        }
        return res;
    }
}