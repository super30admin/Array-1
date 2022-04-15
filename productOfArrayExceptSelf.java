
// Time Complexity : o(n)1
// Space Complexity : o(1) !!! because we aren't using any auxillary array we were supposed to 
// return a int[] and we are returning that.
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[]{};
        }
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        int rp = 1; // running product to keep track
        for(int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp = 1; // reset
        for(int i = n - 2; i >= 0; i--) { // starting from n - 2 cuz prod of array except self
            // for last element is just product of all elements in left of it
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;  
        }
        return result;
    }
}