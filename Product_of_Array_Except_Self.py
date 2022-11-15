class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        res = []
        pro = 1
        res.append(1)
        
        for i in range(1, len(nums)):
            pro = pro * nums[i-1]
            res.append(pro)
            
        pro = 1
        for i in range(len(nums) - 2, -1, -1):
            pro = pro * nums[i+1]
            res[i] = res[i] * pro
            
        return res
