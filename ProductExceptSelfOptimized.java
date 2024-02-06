// TC - O(N)
// SC - O(1) Using output array

// Constraints:
// 2 <= nums.length <= 10^5
// -30 <= nums[i] <= 30
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

public class ProductExceptSelfOptimized {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] result = new int[nums.length];
            result[0] = 1;
            int productRightToLeft = 1;

            for (int i = 1; i < nums.length; i++) {
                result[i] = result[i - 1] * nums[i - 1];
            }

            for (int i = nums.length - 2; i >= 0; i--) {
                productRightToLeft = productRightToLeft * nums[i + 1];
                result[i] = result[i] * productRightToLeft;
            }

            return result;
        }
    }
}