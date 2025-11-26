"""
We use a two pass approach to overcome the exponential brute force approach with i and j pointers, we calculate the product of elements to the left of number and to
the right of the product, this way we can multiply the running product and get our answer
TC is o(n) for traversing the whole array and SC is o(1) (resulant array doesnt count towards space)
"""


class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        #do a two pass approach, one left pass and one right pass

        n = len(nums)
        res = [0] * n
        rp = 1
        res[0] = 1
        #left pass
        for i in range(1,n):
            rp = rp * nums[i-1]
            res[i] = rp

        rp = 1 #reset for right pass
        for i in range(n-2, -1, -1):
            rp = rp * nums[i + 1]
            res[i] = res[i] * rp

        return res

