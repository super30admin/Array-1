#problem 1
#SC:O(1)
#TC:O(N)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #we are going to use 2 passes to solve this
        res = [1]*(len(nums)) #doesnt count as memory based on the question
        prefix = 1
        for i in range(len(nums)): #from left to right
            res[i]= prefix
            prefix*=nums[i]
        postfix =1
        for i in range(len(nums)-1,-1,-1):
            res[i]*=postfix
            postfix*=nums[i]
        return res