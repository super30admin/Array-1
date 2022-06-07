// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes
// Three line explanation of solution in plain english: Taking running product of left and right side
                                                     // Then multiply with left and right array which will be result array

import java.util.Arrays;

public class productExceptItself {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        // Null case
        if (nums == null || n == 0)
            return res;

        // left pass
        res[0] = 1;
        int rp = 1;

        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
            // res[i] = rp;
        }
        rp = 1;

        // Right pass
        for (int i = n - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            res[i] = res[i] * rp;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
