# Leetcode 238 - Product of Array Except Self
# Time - O(n)
# Space - O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        
        result = [1 for num in nums]
        
        
        for i in range(1, len(nums)):
            
            result[i] = nums[i-1] * result[i-1] 
        
        # print("forward", result)
        backProduct= 1
        
        for i in range(len(nums)-1,-1,-1):
            
            
            result[i] = result[i]* backProduct
            backProduct = backProduct * nums[i]
        
        
        return result