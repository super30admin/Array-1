// Time complexity 0(n)
// Space complexity 0(1)
// Code successfully executed in leetcode
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        //base case
        if(nums == null || nums.length == 0) return result;
        // left case
        int temp=1;
        int rp=1;
        
        for(int i=0;i<nums.length;i++){
            rp = rp*temp;
            result[i] = rp;
            temp = nums[i];
        }
        
        //Right pass
         temp=1;
         rp=1;
        
        for(int i=nums.length-1;i >= 0;i--){
            rp = rp*temp;
            result[i] = result[i]*rp;
            temp = nums[i];
        }
        return result;
        
        
        
    }
}