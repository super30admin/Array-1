# Time Complexity = O(n)
# Space Complexity = O(1) 
import numpy as np
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if nums == None or len(nums)==0 :
            return []
        output = []
        runningProd = 1
        for i in range(1, len(nums)):
            runningProd = runningProd*nums[i-1]
            output.append(runningProd)
        for i in range(1, len(nums)):
            runningProd = runningProd*nums[i-1]
            output.append(runningProd)
        return output