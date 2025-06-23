// Time Complexity : O(n), where n is the length of the input array `nums`
// Space Complexity : O(n), for storing the left product, right product, and result arrays
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// This approach uses two additional arrays:
// - `lp[]`: Stores the "product of all elements to the left" of each index
// - `rp[]`: Stores the "product of all elements to the right" of each index
// The final result at index `i` is simply `lp[i] * rp[i]`, which is the product of all elements except `nums[i]`

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // lp[i] will contain the product of all elements to the left of i
        int[] lp = new int[n];

        // rp[i] will contain the product of all elements to the right of i
        int[] rp = new int[n];

        // Result array
        int[] res = new int[n];

        // Initialize first element of lp as 1 since there is no element to the left of index 0
        lp[0] = 1;
        for (int i = 1; i < n; i++) {
            lp[i] = lp[i - 1] * nums[i - 1];  // left product at index i
        }

        // Initialize last element of rp as 1 since there is no element to the right of index n-1
        rp[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            rp[j] = rp[j + 1] * nums[j + 1];  // right product at index j
        }

        // Multiply left and right products to get the final result
        for (int k = 0; k < n; k++) {
            res[k] = lp[k] * rp[k];
        }

        return res;
    }
}