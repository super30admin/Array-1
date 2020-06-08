# Time Complexity : O(n) [n = number of elements in list]
# Space Complexity : O(n) [n is the length of left and right list]
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# 1. The idea is to find the product of elements on the right and product of element on the left using the cumalative product approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        size = len(nums)
        
        left , right , res = [0] * size, [0] * size, [0] * size
        
        left[0] = 1
        
        # Each index now holds the product of values on its left
        for i in range(1,size):
            left[i] = nums[i-1] * left[i-1]
            
        right[size-1] = 1
        
        # Each index now holds the product of values on its right
        for i in reversed(range(size-1)):
            right[i] = nums[i+1] * right[i+1]

        # multiply the left product with the right to get desired value for each index
        for i in range(size):
            res[i] = left[i] * right[i]
            
        return res