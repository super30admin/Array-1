# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
# First solving this using time and space complexity O(N)

# from typing import List
# class Solution:
#     def productExceptSelf(self, nums: List[int]) -> List[int]:
#         result = []
#         left = [1] * len(nums)
#         right = [1] * len(nums)
        
#         # Calculate the cumulative product of elements to the left
#         for i in range(1, len(nums)):
#             left[i] = left[i-1] * nums[i-1]     
        
#         # Calculate the cumulative product of elements to the right
#         for i in range(len(nums)-2, -1, -1):
#             right[i] = right[i+1] * nums[i+1]
        
#         # Calculate the product of left and right arrays
#         for i in range(len(nums)):
#             result.append(left[i] * right[i])
#         print(result)
#         return result

# s = Solution()
# s.productExceptSelf([1,2,3,4])

#Now solving the problem using space complexity O(1)
from typing import List
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] * len(nums)
        
        # Compute the product of elements to the left of each element
        ls = 1
        for i in range(1, len(nums)):
            ls = ls * nums[i-1]
            result[i] *= ls
        
        # Compute the product of elements to the right of each element
        rs = 1
        for i in range(len(nums)-2, -1, -1):
            rs = rs * nums[i+1]
            result[i] *= rs
        print(result)
        return result
    
s = Solution()
s.productExceptSelf([1,2,3,4])