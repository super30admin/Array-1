package S30.Arrays_1;

/*
Time Complexity : Put: O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return nums;

        int[] result = new int[nums.length];


        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }


        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            result[i] = result[i] * right;
            right = right * nums[i];
        }

        return result;
    }
}
