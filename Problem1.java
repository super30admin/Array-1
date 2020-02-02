/* Find the product of array except number itself */

//Space optimised solution-O(1) as we are not using any auxiliary space
// Time Complexity : O(N)
// Space Complexity : O(1) constant space as we are only using output array
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//in brute force we can consider two extra arrays to maintain
//1)product on right side of current index
//2) product on left side of current index
//we can then return result of product of left and right elements

//space optimised solution- we can do above operation in nums array only

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        //edge case
        if(nums == null || nums.length == 0) return result;
        int temp = 1;
        //running product
        int rp = 1; 
        //Left pass
        for(int i = 0; i < nums.length; i++){
            rp = rp * temp;
            result[i] = rp;
            temp = nums[i];
        }
        //Right pass
        temp = 1;
        rp = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            rp = rp * temp;
            result[i] = result[i] * rp;
            temp = nums[i];
        }
        return result;
    }
}