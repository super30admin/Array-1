

import java.util.Arrays;

class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] left = new int[len];
        int[] right = new int[len];
        int[] result = new int[len];

        left[0] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        right[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < len; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductofArrayExceptSelf sol = new ProductofArrayExceptSelf();

        int[] nums = {1, 2, 3, 4};
        int[] output = sol.productExceptSelf(nums);

        System.out.println("Product of array except self: " + Arrays.toString(output));  // Output: [24, 12, 8, 6]
    }
}
