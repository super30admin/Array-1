//Problem1 - https://leetcode.com/problems/product-of-array-except-self/submissions/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: We are taking left product & right product for each element and after that multiplying them with each other to find our find product for all numbers expect itself. 

public class problem1 {s
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int runProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= runProduct;
            runProduct *= nums[i];
        }

        return result;
    }
}
