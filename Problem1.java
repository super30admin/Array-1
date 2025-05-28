// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : None


class Problem1 {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];
        ans[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int rInitial = 1;
        for (int r = nums.length - 1; r >= 0; r--) {
            ans[r] *= rInitial;
            rInitial *= nums[r];
        }
        
        return ans;
    }
}