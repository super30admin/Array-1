
// ## Problem 1

// Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

// Example:

// Input: [1,2,3,4]
// Output: [24,12,8,6]
// Note: Please solve it without division and in O(n).

// Follow up:
// Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

// Did this code successfully run on Leetcode :YES

var productExceptSelf = function(nums) {
    //*Time Complexity : O(N) */
    //*Space Complexity : O(1)/
    let preFix = new Array(nums.length).fill(1)
    //Prefix Array
    for(let i=1;i<nums.length;i++){
        preFix[i] = preFix[i-1]*nums[i-1]
    }
    //Substituted postFix Array with a variable
    let postFix = 1
    for(let i=nums.length-1;i>=0;i--){
        preFix[i] *= postFix
        postFix *= nums[i]
    }
    return preFix
}


// var productExceptSelf = function(nums) {
//     //**Time Complexity: O(N) */
//     //**Space Complexity: O(N) */
//     let res = []
//     let prefix = new Array(nums.length).fill(0)
//     let suffix = new Array(nums.length).fill(0)
//     prefix[0] = 1
//     suffix[nums.length-1] = 1
//     //This will HOld the prefix of products
//     for(let i = 1;i<nums.length;i++){
//         prefix[i]=prefix[i-1]* nums[i-1]
//     }
//     //This wil hold the postFix of the products
//     for(let i = nums.length-2;i>=0;i--){
//         suffix[i] = suffix[i+1]*nums[i+1]
//     }
//     //Res array is the product of both the runningSum Array
//     for(let i = 0;i<nums.length;i++){
//         res[i] = prefix[i]*suffix[i]
//     }
//     return res
// };
