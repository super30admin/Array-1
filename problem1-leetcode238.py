#Time Complexity: O(n)
#Space Complexity: O(n)

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n, runningProduct = len(nums), 1
        leftProduct = [0] * n
        leftProduct[0] = 1

        for i in range(1, len(nums)):
            runningProduct = runningProduct * nums[i - 1]
            leftProduct[i] = runningProduct

        runningProduct = 1
        for i in range(n-2, -1, -1):
            runningProduct = runningProduct * nums[i + 1]
            leftProduct[i] = leftProduct[i] * runningProduct

        return leftProduct
        