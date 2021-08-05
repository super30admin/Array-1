//https://leetcode.com/problems/product-of-array-except-self/
/*
Time: O(N) where N=length of the nums
Space: O(N) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        if (nums == null || nums.length == 0)
            return output;

        output[0] = 1;

        for (int i = 1; i < output.length; i++) {
            output[i] = output[i - 1] * nums[i];
        }

        int R = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            output[i] = output[i] * R;
            R = R * nums[i];
        }

        return output;
    }

}
