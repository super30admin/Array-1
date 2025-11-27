// Time Complexity : O(n) average
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
// 1: We go through two passes for each element in the array, calculating the left and right product for each element
// 2: For each pass, we maintain a running product that contains either the left or right product that we have come across thus far
// 3: After calculating the left array, we use the same array to find the runningProduct and thus the rightProduct and can return the same array
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rp = 1;
        int n = nums.length;
        int[] result = new int[n];
        // left pass,
        // we add 1 to the beginning of the array
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }

        // right pass
        rp = 1;
        for (int i = n - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;

        }

        return result;

    }
}