# Problem #28 Product of Array Except Self
#LeetCode 238 https://leetcode.com/problems/product-of-array-except-self/description/

# Author : Akaash Trivedi
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #238
# Any problem you faced while coding this : No

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        rs = 1
        res = [1] * n

        for i in range(1,n):
            res[i] = rs*nums[i-1]
            rs=res[i]
        
        rs= 1
        # start at second last index to avoid going out of bound at last one
        # range(start, stop, step)
        for j in range(n-2,-1,-1): 
            rs = rs * nums[j+1] # running sum for right
            res[j] = res[j] * rs #running sum * left product thats store in res

        return res