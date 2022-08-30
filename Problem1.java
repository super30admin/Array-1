//Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

// Time: O(n)
// Space: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        if (nums == null || n == 0) return result;
        int rp = 1;
        result[0] = 1;
        // left pass
        for (int i = 1; i<n; i++) {
            rp = rp*nums[i-1];
            result[i] = rp;
        }
        
        rp = 1;
        for (int i = n-2; i >= 0; i--){
            rp *= nums[i+1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}