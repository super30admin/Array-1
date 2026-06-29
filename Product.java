// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*Calculate the product on the left of all the numbers in the array.
Going from right to left calculate the product on the right of the number and multiply with the product obtained before at each position
*/

// Your code here along with comments explaining your approach

/*
## Problem 1 - Leetcode 238.Product of Array Except Self

 */

class Product {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] leftProduct = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct *= nums[i + 1];
            result[i] = result[i] * rightProduct;
        }

        return result;

    }
}