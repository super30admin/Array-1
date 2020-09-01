#// https://leetcode.com/problems/product-of-array-except-self/
#// Time Complexity : O(n)
#// Space Complexity : O(n) same space as input size
#// Did this code successfully run on Leetcode : yes
#// Three line explanation of solution in plain english

# calculate a product left to right of nums, start with 1
# calculate a product right to left of nums, start with 1
# for i in nums.length calculate left[i] * right[i]
# this array will be the answer

productExceptSelf = (nums) ->
  return [] if nums == null or nums.length == 0

  output = []

  # left
  product = 1

  for x in [0..nums.length-1]
    output[x] = product
    product *= nums[x]

  # right
  product = 1
  for x in [nums.length-1..0] by -1
    output[x] *= product
    product *= nums[x]

  output

productExceptSelf([1,2,3,4])
