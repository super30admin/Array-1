#LC 238 - Product of Array Except Self
#Time Complexity - O(2n)
#Space Complexity - O(1)
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if not nums:
            return nums
        tmp = [1] * len(nums)
        for i in range(1,len(nums)):
            tmp[i] = tmp[i-1]*nums[i-1]
        
        i = len(nums)-2
        r = nums[i+1]
        while i >= 0:
            tmp[i] = tmp[i] * r
            r = r * nums[i]
            i = i - 1
        return tmp