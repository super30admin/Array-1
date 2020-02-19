// Time Complexity : O(N) 2 for loops->2N
// Space Complexity : O(1) since the output array does not count as extra space for the purpose of space complexity analysis
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        int leftProduct = 1, rightProduct = 1;
        int[] results = new int[nums.length];
        results[0]=leftProduct;
        for (int i=1; i<nums.length; i++){
            results[i]=leftProduct*nums[i-1];
            leftProduct=results[i];
        }
        for (int i=nums.length-1; i>=0; i--){
            results[i]=results[i]*rightProduct;
            rightProduct=rightProduct*nums[i];
        }
    return results;
    }
}