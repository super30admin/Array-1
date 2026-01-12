// Time Complexity : O(n)
// Space Complexity : O(1)  (output array not counted)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, just needed to do prefix and suffix product without using division.


// Your code here along with comments explaining your approach in three sentences only
// First I store prefix product in the output array so output[i] has product of all elements before i.
// Then I traverse from right side and keep a suffix product and multiply it into output[i].
// This gives product except self in O(n) and constant extra space.

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        // prefix product
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // suffix product and multiply
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * suffix;
            suffix = suffix * nums[i];
        }

        return res;
    }
}
