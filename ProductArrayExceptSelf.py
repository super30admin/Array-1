"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) == 0:
            return []
        result = [0]*(len(nums))
        rp = 1
        # Initializing the first element of my array to 1
        result[0] = 1
        # Moving from left to right and storing the running product
        for i in range(1, len(nums)):
            rp = rp * nums[i - 1]
            result[i] = rp
        # Resetting rp so that i can calculate running product
        # from right to left
        rp = 1
        # Moving from right to left and storing the runnning product
        for i in range(len(nums) - 2, -1, -1):
            rp = rp * nums[i + 1]
            result[i] = result[i] * rp
        return result