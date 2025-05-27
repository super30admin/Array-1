"""
Approach : Have a prefix product array starting from left and right and calculate the resultant array. Optimize to use just a variable 
to hold the left/right prefix product till current index.
t.c. = O(n)
s.c. = O(1)
Did this code successfully run on Leetcode :yes
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [1 for i in range(n)]
        
        lProd, rProd = nums[0], nums[n - 1]
        for i in range(1, n):
            res[i] *= lProd
            lProd *= nums[i]

            res[n - i - 1] *= rProd
            rProd *= nums[n - i - 1]
        return res