# sc : O(1)
# tc : O(2n)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1 for x in nums]
        rpro = 1
        
        for i in range(len(nums) - 2, -1, -1):
            rpro = rpro*nums[i+1]
            res[i] = rpro
        
        print(res)
        lpro = 1
        for i in range(1, len(nums)):
            lpro = lpro*nums[i-1]
            res[i] = lpro*res[i]
        
        return res
        
        
        