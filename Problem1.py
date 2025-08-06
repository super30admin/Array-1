class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []
        left_prod = 1
        for i in range(len(nums)):
            res.append(left_prod)
            left_prod *= nums[i]
        
        right_prod = 1
        for i in range(len(nums)-1, -1, -1):
            res[i] = res[i]*right_prod
            right_prod *= nums[i]
        
        return res
            
