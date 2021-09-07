// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * Keep a running sum from the left and then multiply the number from the right side.
 * Only the result array will be used for storage to minimize storage.
 */

public class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        
        result[0] = 1; //left of first index is out of bounds.
        int runningProd = 1; //by default 1

        // running product from the left
        for(int i = 1; i < nums.length; i++) {
            runningProd *= nums[i - 1];
            result[i] = runningProd; 
        }
        
        runningProd = 1;
        // running product from the right
        for(int i = nums.length -2; i >= 0; i--) {
            runningProd *= nums[i+1];
            result[i] *= runningProd;
        }
        return result;

    }
}
