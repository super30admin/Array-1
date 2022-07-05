/**
 * Time Complexity: O(N) -> Where N is the number of element in the array
 * Space Complexity: O(1) -> We had to return an array as an output
 **/
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int result[] = new int[numsLength];
        int runningProduct = 1;
        result[0] = 1;

        for (int i = 1; i < numsLength; i++) {
            runningProduct = runningProduct * nums[i - 1];
            result[i] = runningProduct;
        }
        runningProduct = 1;
        for (int i = numsLength - 2; i >= 0; i--) {
            runningProduct = runningProduct * nums[i + 1];
            result[i] = runningProduct * result[i];
        }
        return result;
    }
}
