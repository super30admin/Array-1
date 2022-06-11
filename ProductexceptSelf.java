// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

//  ----- Maintain a running product and keep inserting the running product except self into the new array. Calculate the running product from the last element and multiply that with the already existing values in the array and insert it.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int j = n - 2; j >= 0; j--) {
            rp = rp * nums[j + 1];
            result[j] = result[j] * rp;
        }
        return result;

    }
}