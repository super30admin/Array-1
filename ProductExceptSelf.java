// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Used the idea that the result is product of elements to the left
// with the elements to the right. Achieved this with prefixProduct array
// and suffix variable.

// Your code here along with comments explaining your approach
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // not a constraint;
        if (nums.length == 1)
            return nums;

        int[] prefixProduct = new int[nums.length];
        int prefix = 1;
        int[] res = new int[nums.length];
        // creating the prefix product array
        for (int i = 0; i < prefixProduct.length; i++) {
            prefixProduct[i] = prefix * nums[i];
            prefix = prefixProduct[i];
        }

        // we save space by using a suffix product variable
        // and making changes to res
        int suffixProduct = 1;

        for (int i = nums.length - 1; i >= 1; i--) {
            res[i] = suffixProduct * prefixProduct[i - 1];
            suffixProduct = suffixProduct * nums[i];
        }

        res[0] = suffixProduct;

        return res;
    }
}