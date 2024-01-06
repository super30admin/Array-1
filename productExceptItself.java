// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: Find the left running product and replace the value at that index. Find the right running product and then multiply current value with it.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length < 2) return new int[0];
        int[] result = new int[nums.length];
        //left pass
        int rp = 1;
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            rp *= nums[i-1];
            result[i] = rp;
        } 
        rp = 1;
        for (int i = nums.length - 2; i >= 0; i--){
            rp *= nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}
