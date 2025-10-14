
// Time Complexity : O(n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : As I shouldn't use division, solving it with left and right prefix concept helps. First we calculate the left products and store in the array and
// then multiply with right product and update the same array to get the solution.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int rp = 1;
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) { //storing the left products in res array
            res[i] = res[i - 1] * nums[i - 1];
        }
        for(int i=nums.length-2;i>=0;i--){ // updating the res array by multilplting with right product
            rp = rp*nums[i+1];
            res[i] = rp*res[i];

        }

        return res;
    }
}