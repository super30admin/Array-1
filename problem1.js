//// https://leetcode.com/problems/product-of-array-except-self/
//// Time Complexity : O(n)
//// Space Complexity : O(n) same space as input size
//// Did this code successfully run on Leetcode : yes
//// Three line explanation of solution in plain english

// calculate a product left to right of nums, start with 1
// calculate a product right to left of nums, start with 1
// for i in nums.length calculate left[i] * right[i]
// this array will be the answer
var productExceptSelf;

productExceptSelf = function(nums) {
  var i, j, output, product, ref, ref1, x;
  if (nums === null || nums.length === 0) {
    return [];
  }
  output = [];
  // left
  product = 1;
  for (x = i = 0, ref = nums.length - 1; (0 <= ref ? i <= ref : i >= ref); x = 0 <= ref ? ++i : --i) {
    output[x] = product;
    product *= nums[x];
  }
  // right
  product = 1;
  for (x = j = ref1 = nums.length - 1; j >= 0; x = j += -1) {
    output[x] *= product;
    product *= nums[x];
  }
  return output;
};

productExceptSelf([1, 2, 3, 4]);

//# sourceMappingURL=problem1.js.map
