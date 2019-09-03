# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# - This can be solved by keeping left multiplication and right multiplication at every element.

# Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
#       Initializing result array with same lenght as nums 
        result = [1] * len(nums)
#       initializing left and right array as 1.
        left = 1
        right = 1
        
#       now running loop from left side and from first element to last element.
        for i in range(len(nums)):
#           multiplying current result with left variable.
            result[i] *= left
#           Updating left variable by multiplying current nums.
            left *= nums[i]
            
#       now running loop from right side and from last element to first element.
        for j in range(len(nums)-1, -1, -1):
#           multiplying current result with right variable.
            result[j] *= right
#           Updating right variable by multiplying current nums.
            right *= nums[j]
            
        return result