// Time Complexity : O(2N) = O(N)
// Space Complexity : O(1) since we are doing manipulations on the same input array.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Find running product from left excluding current index, of all elements
// to the left of an element. Find running product from right, for all element to right, but include the current
// element that has the running product of all elements to its left.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return new int[] {};

        int runProd = 1;
        int n = nums.length;
        int[] result = new int[n];

        // first pass for left product
        result[0] = 1;
        for(int i=1; i<n; i++) {
            runProd *= nums[i-1];
            result[i] = runProd;
        }

        // second pass for right array
        runProd = 1;
        for (int i = n-2; i>=0; i--) {
            runProd = runProd * nums[i+1];
            result[i] *= runProd;
        }

        return result;
    }
}