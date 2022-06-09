//time complexity : O(n)
//space complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int mul = 1;
        res[0] = 1;
        for(int i=1;i<nums.length;i++){
            mul = mul *nums[i-1];
            res[i] = mul;
        }
        mul = 1;
        for(int i= nums.length-2 ; i>=0; i--){
            mul = mul * nums[i+1];
            res[i] = res[i] * mul ;
        }
        return res;
    }
}