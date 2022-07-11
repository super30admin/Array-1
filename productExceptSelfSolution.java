
// Time Complexity : O(n) // O(2n) as we do left parse and right parse, but we ignore constant so O(n)
// Space Complexity : O(1) //No extra space is used. result array is not used to simulate
// Did this code successfully run on Leetcode : Yes

import java.util.*;

public class productExceptSelfSolution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return new int[0];
        }

        int[] result = new int[nums.length];
        result[0] = 1;
        int runningProduct = 1;
        for (int i = 1; i < nums.length; i++) {
            runningProduct = runningProduct * nums[i - 1];
            result[i] = runningProduct;
        }

        runningProduct = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            runningProduct = runningProduct * nums[i + 1];
            result[i] = result[i] * runningProduct;
        }

        return result;
    }

    public static void main(String[] args) {
        productExceptSelfSolution pess = new productExceptSelfSolution();
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(pess.productExceptSelf(nums)));

    }
}