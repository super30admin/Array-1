/*
 * Question:
 * Given an array nums[], return an array result[] such that:
 * result[i] = product of all elements in nums[] except nums[i],
 * without using division and in O(n) time.
 *
 * Approach:
 * → First pass (left to right): store product of all elements to the left of i in result[i]
 * → Second pass (right to left): use a variable rSum to multiply elements to the right of i
 *   and update result[i] = result[i] * rSum
 *
 * Example:
 * nums = [1, 2, 3, 4]
 * left pass → result = [1, 1, 2, 6]
 * right pass → rSum accumulates right product → final result = [24, 12, 8, 6]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (excluding the result array, no extra space used)
 */

import java.util.Arrays;

public class Problem_1 {
    static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int rSum = 1;
        for (int j = nums.length - 2; j >= 0; j--) {
            rSum = rSum * nums[j + 1];
            result[j] = result[j] * rSum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] nums2 = { -1, 1, 0, -3, 3 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }

}
