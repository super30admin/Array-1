# Time Complexity : Brute Force: O(n)
# Space Complexity : Brute Force: O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : -

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        length = len(nums)

        # Create two array. 
        # Left to store product of all the numbers on the left of current number and Right to store product of all the number on the right.
        # Calculate product of both the arrays.
        left = [None for _ in range(length)]
        right = [None for _ in range(length)]
        left[0] = 1
        for i in range(1,length):
            left[i] = left [i-1] * nums[i-1]
        
        right[-1] = 1
        for i in range(length-2, -1, -1):
            right[i] = right[i+1] * nums[i+1]
        
        for i in range (length):
            left[i] = left[i] * right[i]
        return left
        