#Problem 238. PRODUCT OF ARRAY EXCEPT SELF
# TIME COMPELXITY: O(N) where N denotes number of elements 
# SPACE COMPLEXITY: O(1) given that we are returning the array as an output that we are initializing

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ans=[1]*len(nums)
        right=1
        for i in range(1,len(nums)):
            ans[i]=ans[i-1]*nums[i-1]
        for i in range(len(nums)-1,0,-1):
            right=right*nums[i]
            ans[i-1]=ans[i-1]*right
        return ans