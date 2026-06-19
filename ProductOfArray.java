// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Build prefix products in the result array, where result[i] stores the product of all elements to the left of i.
// Traverse from right to left while maintaining a running suffix product.
// Multiply the prefix product and suffix product for each index to get the product of all elements except itself.

class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rp = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            result[i] = result[i] * rp * nums[i + 1];
            rp = rp * nums[i + 1];
        }

        return result;
    }
}