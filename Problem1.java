// Time Complexity : O(n) + O(n) ~ O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
Build a prefix product array where res[i] stores the product of all numbers to the left of i.
Then traverse from right side and multiply each res[i] with the running product of elements to the right of i.
This way each index gets: (product of all left elements) × (product of all right elements) — without using division.
*/

public class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0) {
            return new int[]{};
        }
        int n = nums.length;
        int[] res = new int[n];
        int runningProduct = 1;
        res[0] = 1;
        for(int i = 1;i<n;i++) {
            res[i] = runningProduct * nums[i-1];
            runningProduct = res[i];
        }

        runningProduct = 1;
        for(int i = n-2;i>=0;i--) {
            res[i] = (runningProduct * nums[i+1]) * res[i];
            runningProduct *= nums[i+1];
        }
        return res;
    }
}
