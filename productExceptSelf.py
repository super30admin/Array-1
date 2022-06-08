"""
TC: O(N)
SC: O(1)
"""

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        res = [1 for num in nums]
        
        left = 1
        res[0] = left
        for i in range(1, len(nums)):
            left *= nums[i-1]
            res[i] = left
            
            
        right = 1
        for i in range(len(nums)-2, -1, -1):
            right *= nums[i+1]
            res[i] *= right
        
        return res