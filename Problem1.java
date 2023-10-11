// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length,lsum = 1,rsum = 1;
        int[] left = new int[n];
        left[0]=1;
        for(int i = 1; i < n;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        for(int j = n - 2; j>=0; j--){
            rsum = rsum*nums[j+1];
            left[j] = left[j]*rsum;
        }
        return left;
    }
}