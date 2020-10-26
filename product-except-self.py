# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this run on Leetcode: Yes
# Approach: 
# The product of all other elements at any index is the product of elements to the left and elements to the right of it
# Compute the left running product in the results array
# Use the same array and traverse it in reverse to compute the right running product
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        length = len(nums)
        result = [0] * length
        
        result[0] = 1
        
        for i in range(1, length):
            result[i] = nums[i - 1] * result[i - 1]
            
        R = 1
        
        for i in reversed(range(length)):
            result[i] = result[i] * R
            R = R * nums[i]
            
        return result