// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[]{};
        }
        
        int rP = 1;
        int[] result = new int[nums.length];
        result[0] = rP;
        
        // Product of the left numbers
        for(int i = 1; i < nums.length; i++){
            rP = rP * nums[i - 1];
            result[i] = rP;
        }
        
        // Reset rP to hold the running product from right side
        rP = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            rP = rP * nums[i + 1];
            result[i] = rP * result[i];
        }
        return result;
    }
}