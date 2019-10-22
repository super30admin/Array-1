"""
Because we are not allowed division we maintain 2 arrays of precomputed products before and after a particular index. 
Both these arrays can be constructed in O(n) time and O(n) space.

Works on leet code 
Time Complexity - O(n)
Space Complexity - O(n)
"""
from collections import deque
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        N = len(nums)
        if N <= 1 :
            return None # edge case .. should never happen

        left = [1] 
        right = deque() 
        right.appendleft(1)
        for i in range(N-1) :
            left.append(left[-1]*nums[i])
            right.appendleft(right[0]*nums[N-i-1])

        return [left[i]*right[i] for i in range(N)]


