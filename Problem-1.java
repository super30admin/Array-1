// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// In first pass - We maintain left elements product
// In second pass - We calculate right elements product
// And storing the result in same place: result[i] = left[i] * right[i]
class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int n = nums.length;

        // Array to calculate left product and to store result after multiplying it with
        // right product
        int[] result = new int[n];

        // initial left product will be 1
        result[0] = 1;

        // left product of
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // initial right product will be 1
        int rightProd = 1;

        // multiply the right element to get the result
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProd;
            rightProd = rightProd * nums[i];
        }

        return result;
    }
}