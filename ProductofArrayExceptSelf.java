// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int r = 1;
        int[] res = new int[n];

        res[0] = 1;

        for (int i = 1; i < n; i++) {
            r = r* nums[i-1];
            res[i] = r;
        }

        r =1;
        for (int i = n-2; i >= 0; i--) {
            r = r * nums[i+1];
            res[i] = r * res[i];
        }

        return res;
    }
}