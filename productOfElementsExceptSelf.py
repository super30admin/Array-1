# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        list = [0]*len(nums)
        rp = 1
        list[0] = rp

        for i in range(1,len(nums)):
            rp *= nums[i-1]
            list[i] = rp

        rp = 1
        for i in reversed(range(len(nums)-1)):
            rp *= nums[i+1]
            list[i] *= rp

        return list
