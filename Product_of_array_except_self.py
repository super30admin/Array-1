# Time Complexity - O(n)
# Space Complexity - O(1)

class Solution:
    
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [None]*len(nums)
        rprod = 1
        result[0] = rprod
        for i in range(1,len(nums)):
            rprod = rprod*nums[i-1]
            result[i] = rprod
        rprod = 1
        for i in range(len(nums)-2,-1,-1):
            rprod = rprod*nums[i+1]
            result[i] = rprod*result[i]
        return result
