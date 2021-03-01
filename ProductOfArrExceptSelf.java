// Maintain two variables, left and right, and while traversing the array from left to right, compute the product and update the result array
// Similarly, while traversing the array from right to left, compute the product and update the result.

// Time Complexity : O(n)
// Space Complexity : O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductOfArrExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return new int[0];

        int left = 1, right = 1;
        int[] res = new int[len];
        Arrays.fill(res, 1);

        for (int i = 1; i < len; i++) {
            left *= nums[i - 1];
            res[i] *= left;
        }

        for (int i = len - 2; i >= 0; i--) {
            right *= nums[i + 1];
            res[i] *= right;
        }

        return res;
    }

    public static void main(String[] args) {
        List<int[]> input = new ArrayList<>();
        Collections.addAll(input, new int[] { 1, 2, 3, 4 }, new int[] {}, new int[] { 0, 0, 0, 0 },
                new int[] { -2, -1, 1, 2 });

        for (int[] nums : input) {
            System.out.println(Arrays.toString(productExceptSelf(nums)));
        }
    }
}