"""
Problem: 238. Product of Array Except Self
Leetcode: https://leetcode.com/problems/product-of-array-except-self/
Example:
    Input:  [1,2,3,4]
    Output: [24,12,8,6]
Solution: Find left and right product of each index separately and multiply them to get the output array
Time Complexity: O(n), where n is the number of elements in nums
Space Complexity: O(1) since we're not considering output array in space
"""


class Solution:
    def product_of_array(self, nums):

        # Base case
        if nums is None or len(nums) is 0:
            return []

        length = len(nums)
        answer = [0] * length
        # Since there are no numbers to the left of first number
        answer[0] = 1

        # each index will store product of left numbers
        for i in range(1, length):
            answer[i] = answer[i-1] * nums[i-1]

        # Since there are no number to the right of last number
        R = 1
        for i in reversed(range(length)):
            answer[i] = answer[i] * R
            R = R * nums[i] # Make R ready to be used in next iteration

        return answer


obj = Solution()
nums = [1, 2, 3, 4]
print(obj.product_of_array(nums))
nums = []
print(obj.product_of_array(nums))