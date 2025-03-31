// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments expla
/*

The approach uses a two-pass prefix and suffix multiplication method.
 First, we traverse from left to right,
 storing the cumulative product of all elements before each index in the result array.
 Then, we traverse from right to left, maintaining a running product of elements after the current
 index and multiplying it with the stored prefix product.
 This ensures that each index holds the product of all elements except itself without using division.
  The solution runs in O(n) time and uses O(1) extra space (excluding the output array).
 * */
class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {


        int[] result = new int[nums.length];


        result[0] = 1;

        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int p = 1;
        for (int i = result.length - 2; i >= 0; i--) {
            //since result does not have right product..we need p
            p = p * nums[i + 1];
            result[i] = result[i] * p;
        }
        return result;
    }
}
