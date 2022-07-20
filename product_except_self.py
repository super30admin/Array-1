#TC => o(n)
#SC => o(n)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        rp = [1]*len(nums)
        for i in range(1,len(nums)):
            rp[i] = nums[i-1]*rp[i-1]
        rpr = nums[-1]    
        for i in reversed(range(len(nums)-1)):
            rp[i] = rp[i]*rpr
            rpr = rpr*nums[i]
        return rp    