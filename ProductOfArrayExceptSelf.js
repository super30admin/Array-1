// Time Complexity : O (n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : nums arrays i travsersed from left to right where result[i] = rp * nums[i - 1] then multiplied with  rp * nums[i + 1] where rp is the running product

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
  if (nums.length === 0 && nums === null) {
    return nums;
  }
  var n = nums.length;
  var result = new Array(n);
  var rp = 1;

  //Moving left to right
  result[0] = rp;
  for (var i = 1; i < n; i++) {
    rp = rp * nums[i - 1];
    result[i] = rp;
  }
  //Moving right to left
  rp = 1;
  for (var i = n - 2; i >= 0; i--) {
    rp = rp * nums[i + 1];
    result[i] = result[i] * rp;
  }

  return result;
};
