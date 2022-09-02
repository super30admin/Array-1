class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        
        arr = []
        prefix = [1]
        suffix = [1]* len(nums)
        
        prod = nums[0]
        for i in range (1,len(nums)):
            
            prefix.append(prod)
            
            prod = prod*nums[i]
        prod = nums[-1]
        for i in range (len(nums)-2,-1,-1):

            suffix[i] = prod
            prod = prod*nums[i]
            
        for i in range(len(nums)):
            arr.append(prefix[i]*suffix[i])
            
        return arr
