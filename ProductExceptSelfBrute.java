// TC - O(N*N)
// SC - O(1) Using output array

// Constraints:
// 2 <= nums.length <= 10^5
// -30 <= nums[i] <= 30
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

public class ProductExceptSelfBrute {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] result = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                int leftProduct = 1;
                int rightProduct = 1;
                for (int j = i - 1; j >= 0; j--) {
                    leftProduct *= nums[j];
                }
                for (int j = i + 1; j < nums.length; j++) {
                    rightProduct *= nums[j];
                }
                result[i] = leftProduct * rightProduct;
            }

            return result;
        }
    }
}