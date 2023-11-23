// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/**
 * Calculate running product from left to right in one array. (Do not multiply current index. Multiply until previous index)
 * Calculate running product from right to left in another array. (Do not multiply current index. Multiply until previous index)
 * Multiply these 2 arrays.
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for(int i=1; i<n; i++)
            result[i] = result[i-1]*nums[i-1];

        int rp = 1;
        for(int i=n-2; i>=0; i--) {
            rp = rp*nums[i+1];
            result[i] = rp*result[i];
        }

        return result;
    }
}



/*
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        left[0] = 1;
        for(int i=1; i<n; i++)
            left[i] = left[i-1]*nums[i-1];

        right[n-1] = 1;
        for(int i=n-2; i>=0; i--)
            right[i] = right[i+1]*nums[i+1];

        for(int i=0; i<n; i++)
            result[i] = left[i]*right[i];

        return result;
    }
}*/
