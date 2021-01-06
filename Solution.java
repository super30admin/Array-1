// Time Complexity : o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int fp = 1;
        int rp = 1;
        result[0] = 1;
        // Forward Product
        for(int i=1; i<=nums.length-1; i++){
            fp = fp * nums[i-1];
            result[i] = fp;
        }
        // Reverse Product
        for(int i = nums.length-2; i>=0; i--){
            rp = rp * nums[i+1];
            result[i] *= rp;
        }
    return result;
    }
}