/**
 * 
 * Given an array nums of n integers where n > 1, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * Idea is to do two passes over the array left to right and vice versa.
 * Doing this, we take care that in forward pass we accumulate product until one before current element.
 * And in second pass, we accumulate product from right side, hence we obtain product except self.
 * 
 * Space Complexity: O(n) for storing results
 * Time Complexity: O(n) 
 * 
 * Leetcode Result:
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of
 * Array Except Self. 
 * Memory Usage: 41.3 MB, less than 100.00% of Java online submissions for 
 * Product of Array Except Self.
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // forward pass
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }
        // backward pass
        int runningProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * runningProduct;
            runningProduct *= nums[i];
        }
        return result;
    }
}
