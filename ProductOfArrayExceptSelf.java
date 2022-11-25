/**
 * TC - O(n)
 * SC - O(1)
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int size = nums.length;


        result[0] = 1;
        int runningProduct = nums[0];

        for(int i = 1; i < nums.length; i++) {
            result[i] = runningProduct;
            runningProduct = runningProduct * nums[i];
        }

        runningProduct = nums[size - 1];

        for(int i = size - 2; i >= 0; i--) {
            result[i] = runningProduct * result[i];
            runningProduct = runningProduct * nums[i];
        }

        return result;
    }
}
