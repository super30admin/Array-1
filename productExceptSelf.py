# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# The solution involves computing the array prefix and postfix,
# Each of which take O(n), and then multiplying them
# This gives the product except the self in O(n) time
# In addition, we do this in place instead of creating additional arrays which let us use O(1) space

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        retArr = [1] * len(nums)

        prefix = 1
        for i in range(len(nums)):
            retArr[i] *= prefix
            prefix *= nums[i]

        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            retArr[i] *= postfix
            postfix *= nums[i]

        return retArr
