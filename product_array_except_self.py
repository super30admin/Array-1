# Time complexity: O(2n)
# Space complexity: O(1) since output array is expected in the question
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        length = len(nums)
        l = [0] * len(nums)
        r = [0] * len(nums)
        output = [0] * len(nums)
        
        l[0] = 1
        r[length-1] = 1
        
        for i in range(1, length):
            l[i] = l[i-1] * nums[i-1]
        for i in reversed(range(length-1)):
            r[i] = r[i+1] * nums[i+1]
        for i in range(len(nums)):
            output[i] = l[i] * r[i]
        return output
        
    #Approach with one array - TBD