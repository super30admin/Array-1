# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        lprod=[1]
        rp=1
        n=len(nums)
        for i in range(1,n):
            rp=nums[i-1]*rp
            lprod.append(rp)
        rp=1
        for i in range(n-2,-1,-1):
            rp=nums[i+1]*rp
            lprod[i]*=rp

        return lprod
