// Product of Array Except Self
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach
// consider a resultant array. calculate the product from left to right and right to left. Consider 1 for the 1st index (left to right).
// All product from left to right upto that number/index but not including that number/index.
// All product from right to left upto that number/index but not including that number/index & multiply that idex with the resultant index.


class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[1,2,3,4,5]
        int [] result = new int[nums.length];

        //left pass
        int rp = 1;
        result[0] = rp;
        for(int i = 1; i<nums.length; i++) {
            rp *= nums[i-1]; //rp upto that num(index-1)
            result[i] = rp; //[1,1,2,6,24]
        }
        //right pass
        rp = 1; //[1]
        for(int i = nums.length-2; i>=0; i--) {
            rp *= nums[i+1]; //1 //5 //20 //60 //120
            result[i] *= rp; //[24]  //[30,24]  //[40,30,24]  //[60,40,30,24]  //[120,60,40,30,24]
        }
        return result;
    }
}
