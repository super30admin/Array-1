// Time Complexity : O(n), where n is the length of the input array
// Space Complexity : O(n) for the left and right arrays (excluding the output array)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// We use two auxiliary arrays: one to store prefix products (left) and one for suffix products (right).
// Each element in the result is the product of all elements to the left and all elements to the right of that index.
// Finally, we multiply the values from the left and right arrays to get the result.

// Your code here along with comments explaining your approach
import java.util.*;

class ArrayProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        // Initialize first element of left to 1 since there are no elements to the left of first
        left[0] = 1;

        // Initialize last element of right to 1 since there are no elements to the right of last
        right[nums.length - 1] = 1;

        // Build the left array such that left[i] contains the product of all elements to the left of index i
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Debug print for left array
        System.out.println("Left: " + Arrays.toString(left));

        // Build the right array such that right[i] contains the product of all elements to the right of index i
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Debug print for right array
        System.out.println("Right: " + Arrays.toString(right));

        // Multiply left and right arrays to get the final answer
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }

    // Example usage
    public static void main(String[] args) {
        ArrayProductExceptSelf sol = new ArrayProductExceptSelf();
        int[] input = {1, 2, 3, 4};
        int[] result = sol.productExceptSelf(input);
        System.out.println("Output: " + Arrays.toString(result));
    }
}