""" Explanation: To get the product of the remaining elements of the arry except itself, I essentially broke the array into two parts.
    Then took the product of all elements on the left side of that element, and then on the right. 
    Time Complexcity: O(n)
    Space Complexcity: O(1)
"""

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)

        products = [1] * n

        for i in range(1,n):
            products[i] = products[i-1] * nums[i-1]

        right = nums[-1]

        for i in range(n-2,-1,-1):
            products[i] *= right
            right *= nums[i]

        return products
