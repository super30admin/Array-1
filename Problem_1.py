#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode :Yes
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1]*len(nums)
        prefix = 1

        for i in range(n):
            result[i] *= prefix
            prefix *= nums[i]
        
        suffix = 1
        for i in range(n-1,-1,-1):
            result[i] *= suffix
            suffix *= nums[i]
        
        return result
            
            
