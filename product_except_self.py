# Time Complexity: O(n) where n is the number of elements present in array
# Space Complexity: O(1) if output array is not considered as extra space
# Ran on Leetcode: Yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not len(nums):
            return []
        out = [1] * len(nums)
        rp = nums[0]
        for i in range(1, len(nums)):
            out[i] = rp
            rp *= nums[i]
        rp = 1
        for i in range(len(nums) - 1, -1, -1):
            out[i] *= rp
            rp *= nums[i]
            
        return out