# https://leetcode.com/problems/product-of-array-except-self
# // Time Complexity : o(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this : None
#
#
# // Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1 for i in range(len(nums))]

        currProduct = nums[0]
        for i in range(1, len(nums)):
            result[i] = currProduct
            currProduct *= nums[i]

        currProduct = nums[-1]
        for i in range(len(nums) - 2, -1, -1):
            result[i] *= currProduct
            currProduct *= nums[i]

        return result
