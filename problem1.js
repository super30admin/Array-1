// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// ## Problem 1
// https://leetcode.com/problems/product-of-array-except-self/

// Given an array nums of n integers where n > 1, return an array output such that 
// output[i] is equal to the product of all the elements of nums except nums[i].

// Example:

// Input: [1,2,3,4]
// Output: [24,12,8,6]
// Note: Please solve it without division and in O(n).

// Follow up:
// Could you solve it with constant space complexity? (The output array does not count 
//     as extra space for the purpose of space complexity analysis.)

const productExceptSelf = function(nums) {
    if(!nums || nums.length === 0) return [];
    let res = [1];
    runSum = 1;
    for(let i = 1; i < nums.length; i++) {
        runSum *= nums[i - 1]
        res.push(runSum);
    }
    runSum = 1;
    for(let j = nums.length - 2; j >= 0; j--) {
        runSum *= nums[j + 1];
        res[j] *= runSum; 
    }
    return res;
};