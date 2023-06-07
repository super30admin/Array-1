class Solution(object):
    def productExceptSelf(self, nums):
        """
        Time complexity: O(n),  n --> length of the input array.
        Space complexity: O(1) excluding the result list, O(n) including the result list.

        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        result = [1] * n  # Initialize the result list with all 1s
        rp = 1  # Initialize the running product to 1

        # Calculate the running product of all elements to the left of each element
        for i in range(1, n):
            # Multiply the running product with the previous element
            rp = rp * nums[i-1]
            result[i] = rp  # Store the running product in the result list

        rp = 1  # Reset the running product to 1

        # Calculate the running product of all elements to the right of each element
        for i in range(n-2, -1, -1):
            # Multiply the running product with the next element
            rp = rp * nums[i+1]
            # Multiply the current value in result by the running product
            result[i] = result[i] * rp

        return result
