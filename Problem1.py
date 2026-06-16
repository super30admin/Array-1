## Problem 1
# https://leetcode.com/problems/product-of-array-except-self/
# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

# Example:

# Input: [1,2,3,4]
# Output: [24,12,8,6]
# Note: Please solve it without division and in O(n).

# Follow up:
# Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        """
        Logic:
        To find the product of all elements except the one at the current index, 
        we can calculate the product of all elements to the left of the index 
        and multiply it by the product of all elements to the right of the index.

        Time Complexity: O(n)
        We iterate through the array of length `n` exactly twice (once forward, 
        once backward). Both passes take O(n) time, resulting in an overall 
        linear time complexity.

        Space Complexity: O(1) auxiliary space
        The problem explicitly states that the output array `result` does not 
        count towards the extra space complexity. We only use a few integer 
        variables (`rp`, `n`), making the auxiliary space complexity O(1).
        """
        rp = 1
        n = len(nums)
        
        # Initialize the result array with 1s
        result = [1 for _ in range(n)]

        # First pass (Left to Right): 
        # Calculate the product of all elements to the LEFT of index i
        for i in range(1, n):
            rp = rp * nums[i - 1] # Running product of left elements
            result[i] = rp        # Store the left product in result[i]

        # Reset running product for the right side pass
        rp = 1 

        # Second pass (Right to Left): 
        # Calculate the product of all elements to the RIGHT of index i 
        # and multiply it directly with the existing left product in result[i]
        for i in range(n - 2, -1, -1):
            rp = rp * nums[i + 1]          # Running product of right elements
            result[i] = result[i] * rp     # Multiply left product by right product

        return result