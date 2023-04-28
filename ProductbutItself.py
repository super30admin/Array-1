## Problem 1

# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
#
# Example:
#
# Input: [1,2,3,4]
# Output: [24,12,8,6]
# Note: Please solve it without division and in O(n).
#
# Follow up:
# Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def productExceptSelf(self, nums):
        if not nums:
            return []
        n = len(nums)
        result = [0] * n
        result[0] = 1
        for i in range(1, n):
            result[i] = result[i - 1] * nums[i - 1]
        right = 1
        for i in range(n - 1, -1, -1):
            result[i] = result[i] * right
            right *= nums[i]
        return result

nums = [1,2,3,4]
print(Solution().productExceptSelf(nums))
