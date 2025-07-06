// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revise basic syntax

//  Array-1
// ## Problem 1
// Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
// Example:
// Input: [1,2,3,4]
// Output: [24,12,8,6]
// Note: Please solve it without division and in O(n).
// Follow up:
// Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Base case: input array is null or empty
        if (nums == null || nums.length == 0){
            return new int[] {};
        }

        int n = nums.length;
        int[] answer = new int[n];
        // Calculating left product for each index - product of all elements to the left of index i
        answer[0] = 1; // no element to left of index 0
        int rp = 1; // running product
        for (int i = 1; i < n; i++){
            rp = rp * nums[i - 1];
            answer[i] = rp;
        }

        // Multiplying with product of all elements to the right of index i
        rp = 1; // resetting running product for right product
        for (int i = n - 2; i >= 0; i--){
            rp = rp * nums[i + 1]; // running product from right
            answer[i] = answer[i] * rp; // multiplying left and right products
        }

        // Returning final array
        return answer;

    }
}
