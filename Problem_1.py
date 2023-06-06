"""
Problem : 1

Time Complexity : O(n)
Space Complexity : O(n)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

We first create an array which stores product of all the number to the left of a number at the same corresponding index
then we create same type of array to store product of all number to the right of a number and multiply number in same indices
to get the final result

"""


# Product of array except self

class Solution(object):
    def productExceptSelf(self, nums):
        res=[1]*len(nums)

        prefix=1
        for i in range(len(nums)):
            res[i]=prefix
            prefix *=nums[i]
        
        postfix=1
        for i in range(len(nums)-1,-1,-1):
            res[i]*=postfix
            postfix*=nums[i]
        
        return res