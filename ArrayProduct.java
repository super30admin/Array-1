public class ArrayProduct {
    // TC is O(n)
    // SC is O(n)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int temp = 1;
        for (int j = n - 2; j >= 0; j--) {
            temp *= nums[j + 1];
            result[j] = temp * result[j];
        }
        return result;
    }
}
