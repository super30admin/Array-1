// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.Arrays;

class Main {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        // to store running product
        int rp = 1;

        // first element is 1 as we need to multiplying in second pass( right running
        // sum).
        result[0] = 1;

        // to store left running product;
        for (int i = 1; i < nums.length; i++) {
            rp *= nums[i - 1];
            result[i] = rp;
        }

        // reset rp
        rp = 1;
        // for right running product
        for (int i = nums.length - 2; i >= 0; i--) {
            rp *= nums[i + 1];
            result[i] *= rp;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}