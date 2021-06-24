// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        int[] output = new int[N];
        output[0] = 1;

        // left products array
        for(int i = 1; i < N; i++) {
            output[i] = output[i-1] * nums[i-1];
        }

        // for right side we use variable R
        int R = 1;
        for(int i = N-1; i >= 0; i--) {
            output[i] = output[i] * R;
            R = R * nums[i];
        }

        return output;
    }
}