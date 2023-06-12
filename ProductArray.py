# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is running product of each element to right side from 0 index then multiply from reverse with the original list and 
# store it in a resultant array then return it.

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res=[]
        rp=1
        for i in nums:
            res.append(rp)
            rp=rp*i
        rp=1
        for i in range(len(nums)-1,-1,-1):
            res[i]=res[i]*rp
            rp=rp*nums[i]
        return res