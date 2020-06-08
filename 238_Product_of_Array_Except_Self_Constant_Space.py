# Time Complexity : O(n) [n = number of elements in list]
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# 1. The idea is to find the product of elements on the right and product of element on the left using the cumalative product approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        size = len(nums)
        res = [0 for i in range(len(nums))]
        
        res[0] = 1
        
        # Each index now holds the product of values on its left
        for i in range(1, len(nums)):
            res[i] = res[i-1] * nums[i-1]
        

        temp = 1 # Initial product on right
        for i in reversed(range(size)):
            res[i] = res[i] * temp
            temp *= nums[i] # find the product on right for next index in the reverse direction
        return res