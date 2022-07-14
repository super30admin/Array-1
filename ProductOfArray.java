// space complexity 0(n)
// time complexity 0(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0 || nums==null)
        {
            return new int[]{};
        }
        int runproduct=1;
        int result[]=new int[nums.length];
        result[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            runproduct=runproduct*nums[i-1];
            result[i]=runproduct;
        }
        runproduct=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            runproduct=runproduct*nums[i+1];
            result[i]=runproduct*result[i];
        }
        return result;
    }
}