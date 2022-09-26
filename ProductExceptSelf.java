// Time Complexity : O(N) where N is number of elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};

        int resProd = 1;

        int[] res = new int[nums.length];
        res[0] = 1;
        res[nums.length - 1] = 1;

        for(int i = 1; i< nums.length; i++) {
            resProd = resProd*nums[i-1];
            res[i] = resProd;
        }

        resProd = 1;
        for(int j = nums.length-2; j>=0; j--){
            resProd = resProd*nums[j+1];
            res[j] = res[j]*resProd;
        }

        return res;
    }
}