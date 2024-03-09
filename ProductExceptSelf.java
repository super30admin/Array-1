import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Initialize the output array with 1
        Arrays.fill(output, 1);
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] *= leftProduct;
            leftProduct *= nums[i];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result)); // Output: [24, 12, 8, 6]
    }
}
