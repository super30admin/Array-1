
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] out = new int[nums.length];
        int prefSum = 1;
        int sufSum = 1;

        for (int i = 0 ; i< nums.length; i++){
            out[i] = prefSum;
            prefSum *= nums[i];
        }

        for (int i = nums.length-1; i>=0; i--){
            out[i]*= sufSum;
            sufSum *= nums[i];
        }
        return out;

    }
}