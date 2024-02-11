// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

/**
 * We can do this with 2 arrays for prefix and suffix product, but to
 * optimize on the space we are modifying the prefix array itself.
 */
// Your code here along with comments explaining your approach
public class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for(int i = 1; i < n; i++) {
            res[i] = nums[i-1] * res[i-1];
        }

        int rp = nums[n-1];
        for(int i = n - 2; i >= 0; i--) {
            res[i] *= rp;
            rp *= nums[i];
        }

        return res;
    }
}
