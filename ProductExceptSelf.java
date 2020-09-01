//Time Complexity- O(n)
//Space Complexity=O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]output=new int[nums.length];
        int product=1;
        for(int i=0;i<nums.length;i++)
        {
            output[i]=product;
            product*=nums[i];
        }
        product=1;
        for(int i=nums.length-1;i>=0;i--)
        {
           output[i]=product*output[i];
           product*=nums[i];
        }
        return output;
        
    }
}