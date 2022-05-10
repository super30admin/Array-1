#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if len(nums) == 0:
            return -1
        
        result = [1]*len(nums)
        prod = 1
        
        for i in range(1,len(nums)):
            prod = prod*nums[i-1]
            result[i] = prod
        
        prod = 1
        
        for i in range(len(nums)-2,-1,-1):
            prod = prod*nums[i+1]
            result[i] = result[i] * prod
            
        return result
            