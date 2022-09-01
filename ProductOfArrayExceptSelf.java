// Time Complexity - O(n)
// Space Complexity - O(1)

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1; // running product

        // null check
        if (n == 0 || nums == null) return result;

        result[0] = 1; // initialize first value for result

        for (int i=1; i<n; i++) {
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        rp = 1; // reset running product to 1

        // traverse from right to left
        for (int j=n-2; j>=0; j--) {
            rp *= nums[j+1];
            result[j] = result[j] * rp;
        }

        return result;
    }
}
