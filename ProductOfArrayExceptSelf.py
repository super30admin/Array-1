'''
TC: O(n)
SC: O(1)
'''
from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        start = 1
        res = [1]*len(nums)
        for i,v in enumerate(nums):
            res[i] = start
            start = start*v
        start = 1
        for i in range(len(nums)-1,-1,-1):
            res[i] = res[i]*start
            start = start*nums[i]
        return res
s = Solution()
print(s.productExceptSelf([1,2,3,4]))
print(s.productExceptSelf([-1,1,0,-3,3]))
print(s.productExceptSelf([5,2]))