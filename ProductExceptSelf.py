# // Time Complexity : approach 1 o(n) approach 2 o(n)
# // Space Complexity : app 1 - o(2n) approach 2 -o(1)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english
# 1) idea is to keep running product of left part and right part so that the o/p at i is just the product of left and right part
# 2) to optimize the space fill left rp in the result array and then use this array to find the o/p by multiplying the right 

# // Your code here along with comments explaining your approach
from typing import List

# approach 1:
# class Solution:
#     def productExceptSelf(self, nums: List[int]) -> List[int]:
#         l , r = [1] * len(nums) ,[1] * len(nums)
#         for i in range(1,len(nums)):
#             l[i] = nums[i-1] * l[i-1]
#         for i in range(len(nums)-2,-1,-1):
#             r[i] = nums[i+1] * r[i+1]
#         for i in range(len(nums)):
#             nums[i] = l[i]*r[i]
#         return nums


# approach 2
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res,rp = [1] * len(nums) ,1
        for i in range(1,len(nums)):
            rp = nums[i-1] * rp
            res[i] = rp
        rp = 1
        for i in range(len(nums)-2,-1,-1):
            rp = nums[i+1] * rp
            res[i] = res[i] * rp
        return res
