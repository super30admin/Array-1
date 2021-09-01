//Time complexity: O(N)
//Space complexity: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        int rp = 1;
        for(int i = 1; i < nums.length; i++) {
            rp = rp * nums[i-1];
            output[i] = rp;
        }
        rp = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            rp = rp * nums[i+1];
            output[i] = output[i] * rp;
        }
        return output;
        
    }
}