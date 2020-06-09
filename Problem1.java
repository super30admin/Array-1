// Problem Statement:
// Given an array nums of n integers where n > 1, 
// return an array output such that output[i] is equal to the 
// product of all the elements of nums except nums[i].
// Example:
// Input: [1,2,3,4] Output: [24,12,8,6] Note: Please solve it without division and in O(n).
// Follow up: Could you solve it with constant space complexity? 
// (The output array does not count as extra space for the purpose of space complexity analysis.)


// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problems faced while solving this problem? No
// Approach : For every given index, we will make use of product of all numbers
// to the left of it and then multiply it by product of all numbers to the right in the same 
// arraylist by maintaining running product.


// Your code here along with comments explaining your approach

class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        ans[0] = 1;
        //left side
        for(int i=1;i<length;i++) {
            ans[i] = nums[i-1]*ans[i-1];
        }
        int right = 1;
        for(int i=length-1;i>=0;i--) {
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;
    }
}