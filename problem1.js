// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// ## Problem 1

// Given an array nums of n integers where n > 1, return an array output such that 
// output[i] is equal to the product of all the elements of nums except nums[i].

// Example:

// Input: [1,2,3,4]
// Output: [24,12,8,6]
// Note: Please solve it without division and in O(n).

// Follow up:
// Could you solve it with constant space complexity? (The output array does not count 
//     as extra space for the purpose of space complexity analysis.)

var productExceptSelf = function(nums) {
    let left = [1], leftSum = 1;
    let right = [1], rightSum = 1;
    let res = [];

    for(let i = 1; i<nums.length; i++) {
        leftSum *= nums[i - 1];
        left.push(leftSum);
    }
    for(let j = nums.length - 2; j>= 0; j--) {
        rightSum *= nums[j+1];
        right.unshift(rightSum);
    }
    for(let z=0; z < left.length; z++) {
        res.push(left[z] * right[z]);
    }
    return res;
};