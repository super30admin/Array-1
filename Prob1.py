#Time complexity: O(n)   
#Space complexity: O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = [0 for i in xrange(len(nums))]
        rprod, res[0] = 1,1
        #first pass, calculating all left products
        for i in xrange(1,len(nums)):
            rprod *= nums[i-1]
            res[i] = rprod
        #set the running prod back to 1
        rprod = 1
        #second pass, calculating all right products
        for i in xrange(len(nums)-2,-1,-1):
            rprod *= nums[i+1]
            res[i] *= rprod
        
        return res