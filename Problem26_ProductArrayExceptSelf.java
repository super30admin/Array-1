// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english: 

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res, 1);
        for(int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int prevVal = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * prevVal;
            prevVal = prevVal * nums[i];
        }
        return res;
    }
}