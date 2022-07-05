class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prod=1
        left=[0 for _ in range(len(nums))]
        
        left[0]=1
        
        for i in range(1,len(nums)):
            prod*=nums[i-1]
            left[i]=prod
        
        prod=1
        
        for i in range(len(nums)-2,-1,-1):
            prod*=nums[i+1]
            left[i]*=prod
            
        return left
        
            