// Time Complexity : O(n)
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Time limit exceeded, for a test case which contained combination of 1 and -1, I have posted in slack.
// I have used "result =  result.concat(rp)" which threw time limit exceeded exception, after using result.push(rp) it resolved the error
// Reason - concat in js creates a new array and takes O(n) for each element, so always it is better to use push.

// Three line explanation of solution in plain english
// Approach:
// 1. First we need calculate the left array by calculating the running product.
// 2. Reset the running product
// 3. Calculate the rp from right and multiply with corresponding element in left array.

// Your code here along with comments explaining your approach

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function (nums) {
  if (!nums || !nums.length) return [];

  let result = [1];
  let rp = 1;

  const len = nums.length;

  // calculate the left array
  for (let i = 1; i <= len - 1; i++) {
    rp = rp * nums[i - 1];
    result.push(rp);
  }

  // reset the running product
  rp = 1;

  // calculate the runnning product from right and multiply with corresponding element in left array
  for (let i = len - 2; i >= 0; i--) {
    rp = rp * nums[i + 1];
    result[i] = result[i] * rp;
  }

  return result;
};
