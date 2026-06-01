//Time Complexity: O(n)
//Space Complexity: O(1)

public class ProductExceptSelf {
    int[] result;

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        result = new int[n];
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        int product = 1;
        for (int i = n - 2; i >= 0; i--) {
            product = product * nums[i + 1];
            result[i] = product * result[i];

        }
        return result;
    }
}
