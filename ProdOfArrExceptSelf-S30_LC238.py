class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # Leetcode submission successful.
        # Time Complexity = O(n)
        # Space Complexity = O(1) as expected output is an array.

        # Left pass stores product of elements at left of the index in each iteration.
        run_prod = 1
        result = []
        result.append(run_prod)  # Left of first element is initial run_prod hence storing 1.

        # Left pass starts at first index as 0th index value has already been put.
        for i in range(1, len(nums)):
            run_prod *= nums[i - 1]
            result.append(run_prod)

        # Initializing run_prod to 1 again.
        run_prod = 1

        # Right pass generates product of elements at right of the index in each iteration and then updates the result array by multiplying element in the result array with the run_prod generated.
        # Right pass starts at 2nd last index as we don't have anything to the right of last index.
        for j in range(len(nums) - 2, -1, -1):
            run_prod *= nums[j + 1]
            result[j] *= run_prod

        return result