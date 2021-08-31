// TIME: O(n)
// SPACE: O(1)
// SUCCESS on LeetCode

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        
        output[0] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            output[i] = nums[i] * output[i-1];
        }
        
        int rev = 1;
        
        for (int i = nums.length - 1; i > 0; i--) {
            output[i] = rev * output[i-1];
            rev = nums[i] * rev;
        }
        
        output[0] = rev;
        
        return output;
    }
}
