// Time Complexity : O(2n) where n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english: We find the left side product of each element looping through the array and right side product looping again, but in the second loop, we store the results in the same array by multiplying with the value at the existing index(which is left side product).

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        if (nums == null || nums.length == 0)
            return result;
        result[0] = 1;
        int rp = 1;
        // left side
        for (int i = 1; i < nums.length; i++) {
            rp *= nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        // right side
        for (int i = nums.length - 2; i >= 0; i--) {
            rp *= nums[i + 1];
            result[i] *= rp;
            ;
        }
        return result;
    }
}