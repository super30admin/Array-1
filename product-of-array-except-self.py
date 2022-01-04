'''

TC: O(n)
SC: O(1)

Intuition: calculate multp from left to right, and multiply it with mulp from right to left
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        nlen = len(nums)
        if not nlen:
            return []
        
        res = [1]
        
        for i in range(1, nlen):
            res.append(res[-1] * nums[i - 1])
        # print(res)
        pm = 1
        
        for i in range(nlen - 2, -1, -1):
            pm *= nums[i+1]
            res[i] *= pm
        
        return res
        