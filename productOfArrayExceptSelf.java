// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// Your code here  with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return new int[1];
        // Create a result array
        int[] result = new int[n];
        // Multiply all values of right side and put them in result
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = nums[i - 1] * result[i - 1];

        }
        // Create a running multipler for multiplying all values of left side
        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = r * result[i];
            r = r * nums[i];
        }
        return result;
    }
}