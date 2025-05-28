// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        int[] suffix = new int[n + 1];
        int[] ans = new int[n];
        prefix[0] = 1;
        suffix[n] = 1;
        for(int i = 1;i <= n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
            suffix[n-i] = suffix[n-i+1] * nums[n-i];
        }

        for(int i = 0; i < n; i++){
            ans[i] = prefix[i] * suffix[i+1];
        }
        return ans;
    }
}
