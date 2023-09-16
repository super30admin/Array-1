class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Check if the input array is null or empty
        if (nums == null || nums.length == 0)
            return new int[]{};

        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = 1;

        // Calculate the product of elements to the left of each index
        for (int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }

        rp = 1;
        // Calculate the product of elements to the right of each index
        for (int i = n - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}

// Time Complexity: O(N) - We iterate through the array twice, but each pass is O(N).
// Space Complexity: O(1) - We use a single extra array to store the result. Question says that we need to return an array. So we're not counting that space
