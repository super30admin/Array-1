# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Not really but just took a little time to understand the range of for loop from right side

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        n = len(nums)  # length of the array

        result = [0] * n  # the final answer to return

        result[0] = 1  # as there are no elements to the left of index 0

        # store the running product for elements to the left
        for i in range(1, n):
            # result[i] contains the product of all the elements to the left
            # result[i - 1] product of all elements to the left of 'i - 1'
            result[i] = nums[i - 1] * result[i - 1]

        # r contains product of all elements to the right

        r = 1  # as there are no elements at index of n - 1 we write r = 1

        # store the running product for the elements to the right
        for i in range(n-2, -1, -1):
            r = r * nums[i + 1]
            result[i] = result[i] * r

        return result
