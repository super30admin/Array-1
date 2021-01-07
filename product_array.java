// Time Complexity : O(N) where N is the no. of elements in nums array
// Space Complexity : O(1) as it is mentioned in question to not consider output array space
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        
        result[0] = 1;
        for(int i = 1; i< len; i++)
            result[i] = result[i-1] * nums[i-1];
        
        int running_product = 1;
        for(int i = len-1; i >=0; i--){
            result[i] = result[i] * running_product;
            running_product = running_product * nums[i];
        }
        return result;
    }
}