# Time Complexity : O(n) where n : length of input array
# Space Complexity : O(n)

from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        left = [1] * n
        right = [1] * n
        
        # Compute the product of all the elements to the left of each element
        for i in range(1, n):
            left[i] = left[i-1] * nums[i-1]
        
        # Compute the product of all the elements to the right of each element
        for i in range(n-2, -1, -1):
            right[i] = right[i+1] * nums[i+1]
        
        # Compute the product of all the elements except the current element
        result = [left[i] * right[i] for i in range(n)]
        
        return result