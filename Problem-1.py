# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : no
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        r= [1] *len(nums)
        temp = 1
        rc = 1
        # multiply all from left to right
        for i in range(len(nums)): 
            r[i] = rc*temp
            rc = r[i]
            temp = nums[i]
        temp = 1
        rc = 1
        #multiply all from right to left
        for i in range(len(nums)-1,-1,-1): 
            r[i] = rc*temp*r[i]
            rc = rc*temp
            temp = nums[i]
        #return result
        return r
            