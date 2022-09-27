// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// Going throught the array in 2 passes.
// In the 1st pass adding prefix product.
// In the 2nd pass from reverse adding the postfix product.

public class ProductArraySolution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int prefix = 1;
        
        for(int i = 0; i < nums.length; i += 1) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        
        int postfix = 1;
        for(int i = nums.length - 1; i >= 0; i -= 1) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        
        return result;
    }
}
