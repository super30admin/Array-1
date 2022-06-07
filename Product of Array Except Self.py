# time complexity is o(n), where n is the size of the input
# space complexity is o(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1 for i in range(len(nums))]
        if(len(nums) == 0):
            return res
        rp = 1
        res[0] = rp
        #left product 
        for i in range(1,len(nums)):
            rp *= nums[i-1]
            res[i] = rp
        #right product
        rp = 1
        for i in range(len(nums)-2,-1,-1):
            rp *= nums[i+1]
            res[i] *= rp
        return res
            
        
            
            
        