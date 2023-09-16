public class ProductExceptSelf {

    public int[] solution(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int n = nums.length;

        int[] result = new int[n];
        int runningProduct = 1;
        result[0] = runningProduct;
        for (int i = 1; i < n; i++) {
            runningProduct = runningProduct * nums[i - 1];
            result[i] = runningProduct;
        }

        runningProduct = 1;

        for (int i = n - 2; i >= 0; i--) {
            runningProduct = runningProduct * nums[i + 1];
            result[i] = runningProduct * result[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductExceptSelf p = new ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = p.solution(nums);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
