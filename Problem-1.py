class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        lent = len(nums)-1
        res = [0]*(lent+1)
        res1 = [0]*(lent+1)
        for i in range(lent+1):
            if i == 0:
                res[i] = 1
            else:
                res[i] = res[i-1]*nums[i-1]                
        for i in range(lent,-1,-1):
            if i == lent:
                res1[i] = 1
            else:
                res1[i] = res1[i+1]*nums[i+1]
        for i in range(lent):
            res[i] = res[i]*res1[i]
            
        return res
            