# Time Complexity: O(n)
# Space Complexity: O(n)
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