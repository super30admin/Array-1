// TC - O(N)
// SC - O(N)


// Constraints:
// 2 <= nums.length <= 10^5
// -30 <= nums[i] <= 30
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

public class ProductExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] productLeftToRight = new int[nums.length];
            int[] productRightToLeft = new int[nums.length];

            productLeftToRight[0] = 1;
            productRightToLeft[nums.length - 1] = 1;
            for (int i = 1; i < nums.length; i++) {
                productLeftToRight[i] = productLeftToRight[i - 1] * nums[i - 1];
                productRightToLeft[nums.length - 1 - i] = productRightToLeft[nums.length - i] * nums[nums.length - i];
            }

            for (int i = 0; i < nums.length; i++) {
                productLeftToRight[i] = productLeftToRight[i] * productRightToLeft[i];
            }

            return productLeftToRight;
        }
    }
}