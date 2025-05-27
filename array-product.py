# For each index, store the product of all elements to its left in the result array.
# Then, multiply each result by the product of all elements to its right using a second pass.
# This avoids using division and ensures O(n) time and O(1) extra space.

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        answer = [1] * n
        left = 1
        for i in range(n):
            answer[i] = left
            left *= nums[i]
        right = 1
        for i in range(n - 1, -1, -1):
            answer[i] *= right
            right *= nums[i]
        return answer
        