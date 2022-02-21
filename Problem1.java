// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;
public class Problem1 {
    
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        // make ans array as the prefixproduct array for now
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        // current suffixproduct from end of nums array
        int currsuffixproduct = 1, k = nums.length-1;
        // Keep on updating the elements of the ans array from the end by multiplying the already present prefixproduct by the currnt suffixproduct
        for (int i = nums.length-1; i >= 0; i--) {
            ans[i] *= currsuffixproduct;
            // Update current suffixproduct
            currsuffixproduct*=nums[k--];
        }
        // Return the final ans array
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
}
