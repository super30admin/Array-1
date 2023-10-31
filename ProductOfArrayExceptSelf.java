// Time Complexity : O(n)
// Space Complexity : O(1)
class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] result = productExceptSelf(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int n = nums.length;
        int[] result = new int[n];
        int runningProduct = 1;
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            runningProduct = runningProduct * nums[i - 1];
            result[i] = runningProduct;
        }
        runningProduct = 1;
        for (int i = n - 2; i >= 0; i--) {
            runningProduct = runningProduct * nums[i + 1];
            result[i] = result[i] * runningProduct;
        }
        return result;
    }
}