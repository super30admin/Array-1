/* the time complexity of this implementation is O(n) where n is the length of
the array. The space complexity is O(n)
* */
import java.util.Arrays;

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] result = new int[n];

        // Compute the products of all elements to the left of i
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        // Compute the products of all elements to the right of i
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        // Compute the products of all elements except nums[i]
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ProductExceptSelf product = new ProductExceptSelf();
        int[] result = product.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
