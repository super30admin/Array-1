#Time Complexity :  O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no


class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        left = []
        right = 1
        left.append(1)
        for index in range(1,len(nums)):
            left.append(nums[index-1]*left[index-1]) #iterating and maintaining left product of each element in one array
            
        for index in range(len(nums)-1,-1,-1):   #iterating from reverse and maintaining right product 
            left[index] = left[index]*right 
            right = right*nums[index]
            
        return left