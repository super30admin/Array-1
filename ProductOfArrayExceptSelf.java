// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int x=1;
        int r=1;
        int temp =0;
        for(int i=0;i<nums.length;i++){
            output[i] = nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            r = r*output[i];
            nums[i] = r;
        }
        for(int i=0;i<nums.length;i++){
            temp = output[i];
            if(i==nums.length-1){
                output[i] = x;
            }
            else{
                output[i] = x*nums[i+1];
            }
            x = x*temp;
        }
        return output;
    }
}