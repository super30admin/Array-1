"""
time: O(n)
Space: O(n)
Leet: Accepted
Problems: None
"""

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        left = 1
        right = 1
        leftarr = [0] * len(nums)

        #Construct left array consisting of products to the left of element in question
        for i in range(len(nums)):
            leftarr[i] = left
            left *= nums[i]

        #Find successive elements of right array and multiply with respective element of the left array for final output
        for i in range(len(nums)-1,-1,-1):
            leftarr[i] *= right
            right *= nums[i]

        return leftarr
